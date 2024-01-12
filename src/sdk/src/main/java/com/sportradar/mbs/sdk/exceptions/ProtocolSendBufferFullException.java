package com.sportradar.mbs.sdk.exceptions;

public class ProtocolSendBufferFullException extends SdkException {

    public ProtocolSendBufferFullException() {
        super(ExceptionCode.ProtocolSendBufferFull, "Send buffer is full.", null);
    }
}
