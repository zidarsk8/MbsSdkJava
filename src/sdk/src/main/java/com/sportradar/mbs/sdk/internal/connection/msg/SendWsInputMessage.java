package com.sportradar.mbs.sdk.internal.connection.msg;

import com.sportradar.mbs.sdk.internal.connection.msg.base.WsInputMessage;

import java.nio.ByteBuffer;
import java.util.List;

public class SendWsInputMessage extends WsInputMessage {

    private final List<ByteBuffer> content;

    public SendWsInputMessage(final String correlationId, final List<ByteBuffer> content) {
        super(correlationId);
        this.content = content;
    }

    public List<ByteBuffer> getContent() {
        return content;
    }
}
