package com.sportradar.mbs.sdk.exceptions;

public class ProtocolInvalidResponseException extends SdkException {

    public ProtocolInvalidResponseException(final String content) {
        super(ExceptionCode.ProtocolInvalidResponse, content, null);
    }
}
