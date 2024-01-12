package com.sportradar.mbs.sdk.exceptions;

public class ServerErrorResponseException extends SdkException {

    private final int errorCode;

    public ServerErrorResponseException(final int errorCode, final String errorMessage) {
        super(ExceptionCode.ServerErrorResponse, errorMessage, null);
        this.errorCode = errorCode;
    }

    public int getErrorCode() {
        return errorCode;
    }
}
