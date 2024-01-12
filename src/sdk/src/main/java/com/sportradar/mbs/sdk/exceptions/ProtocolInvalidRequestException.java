package com.sportradar.mbs.sdk.exceptions;

public class ProtocolInvalidRequestException extends SdkException {

    public ProtocolInvalidRequestException(final String content) {
        super(ExceptionCode.ProtocolInvalidRequest, content, null);
    }
}
