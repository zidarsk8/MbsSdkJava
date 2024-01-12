package com.sportradar.mbs.sdk.exceptions;

public abstract class SdkException extends RuntimeException {

    private final int code;

    public SdkException(final int code, final String message, final Throwable cause) {
        super(message, cause);
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
