package com.sportradar.mbs.sdk.exceptions;

public class SdkNotConnectedException extends SdkException {

    public SdkNotConnectedException() {
        this(null);
    }

    public SdkNotConnectedException(final Exception cause) {
        super(ExceptionCode.SdkNotConnected, "Sdk is not connected or is disposed", cause);
    }
}
