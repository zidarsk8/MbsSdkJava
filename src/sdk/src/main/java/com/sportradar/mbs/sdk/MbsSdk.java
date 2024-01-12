package com.sportradar.mbs.sdk;

import com.sportradar.mbs.sdk.exceptions.SdkException;
import com.sportradar.mbs.sdk.exceptions.SdkNotConnectedException;
import com.sportradar.mbs.sdk.internal.protocol.ProtocolProvider;
import com.sportradar.mbs.sdk.internal.utils.ExcSuppress;
import com.sportradar.mbs.sdk.protocol.TicketProtocol;

import java.util.function.BiConsumer;

public class MbsSdk implements AutoCloseable {

    private final Object lock;
    private final ProtocolProvider protocolProvider;
    private final BiConsumer<MbsSdk, Exception> unhandledExceptionHandler;

    private boolean connected = false;
    private boolean closed = false;

    public MbsSdk(final MbsSdkConfig config) {
        this.unhandledExceptionHandler = config.getUnhandledExceptionHandler();
        this.protocolProvider = new ProtocolProvider(config, this::handleException);
        this.lock = new Object();
    }

    public TicketProtocol getTicketProtocol() {
        return this.protocolProvider.getTicketProtocol();
    }

    public void connect() {
        try {
            synchronized (this.lock) {
                if (this.closed) throw new RuntimeException("MbsSdk is closed.");
                if (this.connected) return;
                this.protocolProvider.connect();
                this.connected = true;
            }
        } catch (final SdkException sdkException) {
            throw sdkException;
        } catch (final Exception exception) {
            throw new SdkNotConnectedException(exception);
        }
    }

    @Override
    public void close() {
        synchronized (this.lock) {
            if (this.closed) return;
            this.connected = false;
            ExcSuppress.close(this.protocolProvider);
            this.closed = true;
        }
    }

    private void handleException(final Exception exception) {
        final BiConsumer<MbsSdk, Exception> handler = unhandledExceptionHandler;
        if (handler == null) {
            return;
        }
        try {
            handler.accept(this, exception);
        } catch (final Exception ignored) {
        }
    }
}
