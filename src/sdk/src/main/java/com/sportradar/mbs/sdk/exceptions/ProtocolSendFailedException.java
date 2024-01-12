package com.sportradar.mbs.sdk.exceptions;

public class ProtocolSendFailedException extends SdkException {

    public ProtocolSendFailedException(final Exception cause) {
        super(ExceptionCode.ProtocolSendFailed, "Protocol send failed", cause);
    }
}
