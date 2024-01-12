package com.sportradar.mbs.sdk.exceptions;

public class WebSocketConnectionException extends SdkException {

    public WebSocketConnectionException(final Exception cause) {
        super(ExceptionCode.WebSocketFailure, "WebSocket connect failed", cause);
    }

    public WebSocketConnectionException(final String message) {
        super(ExceptionCode.WebSocketFailure, message, null);
    }
}
