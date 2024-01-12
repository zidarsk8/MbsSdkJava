package com.sportradar.mbs.sdk.exceptions;

public class AuthTokenFailureException extends SdkException {

    public AuthTokenFailureException(final Exception cause) {
        super(ExceptionCode.AuthTokenFailure, "Get auth token failed", cause);
    }

    public AuthTokenFailureException(final String message) {
        super(ExceptionCode.AuthTokenFailure, message, null);
    }
}
