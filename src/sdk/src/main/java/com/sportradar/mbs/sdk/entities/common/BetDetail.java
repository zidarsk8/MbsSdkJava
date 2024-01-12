package com.sportradar.mbs.sdk.entities.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportradar.mbs.sdk.entities.suggestion.Suggestion;

public class BetDetail {

    @JsonProperty("code")
    private int code;
    @JsonProperty("suggestion")
    private Suggestion suggestion;
    @JsonProperty("betId")
    private String betId;
    @JsonProperty("selectionDetails")
    private SelectionDetail[] selectionDetails;
    @JsonProperty("message")
    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int value) {
        code = value;
    }

    public Suggestion getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(Suggestion value) {
        suggestion = value;
    }

    public String getBetId() {
        return betId;
    }

    public void setBetId(String value) {
        betId = value;
    }

    public SelectionDetail[] getSelectionDetails() {
        return selectionDetails;
    }

    public void setSelectionDetails(SelectionDetail[] value) {
        selectionDetails = value;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String value) {
        message = value;
    }

}
