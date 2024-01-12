package com.sportradar.mbs.sdk.exceptions;

public class ProtocolTimeoutException extends SdkException {

    public ProtocolTimeoutException() {
        super(ExceptionCode.SdkNotConnected, "Response not received in configured time window", null);
    }
}
