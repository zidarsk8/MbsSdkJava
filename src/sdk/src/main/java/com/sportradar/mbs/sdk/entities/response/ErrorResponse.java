package com.sportradar.mbs.sdk.entities.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ErrorResponse extends ContentResponse {

    @JsonProperty("code")
    private int errorCode;
    @JsonProperty("message")
    private String errorMessage;

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String value) {
        errorMessage = value;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int value) {
        errorCode = value;
    }

}
