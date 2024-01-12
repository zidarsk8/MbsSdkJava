package com.sportradar.mbs.sdk.exceptions;

public class ProtocolMessageTooBigException extends SdkException {

    public ProtocolMessageTooBigException() {
        super(ExceptionCode.ProtocolMessageTooBig, "Max message size is 120kB", null);
    }
}
