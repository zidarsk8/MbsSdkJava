package com.sportradar.mbs.sdk.entities.common;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BetValidation {

    @JsonProperty("code")
    private int code;
    @JsonProperty("betId")
    private String betId;
    @JsonProperty("message")
    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int value) {
        code = value;
    }

    public String getBetId() {
        return betId;
    }

    public void setBetId(String value) {
        betId = value;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String value) {
        message = value;
    }

}
