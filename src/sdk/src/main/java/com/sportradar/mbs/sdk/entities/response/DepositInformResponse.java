package com.sportradar.mbs.sdk.entities.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DepositInformResponse extends ContentResponse {

    @JsonProperty("code")
    private int code;
    @JsonProperty("message")
    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int value) {
        code = value;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String value) {
        message = value;
    }

}
