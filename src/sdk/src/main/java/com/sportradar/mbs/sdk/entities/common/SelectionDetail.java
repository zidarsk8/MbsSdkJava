package com.sportradar.mbs.sdk.entities.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportradar.mbs.sdk.entities.odds.Odds;
import com.sportradar.mbs.sdk.entities.selection.Selection;

public class SelectionDetail {

    @JsonProperty("code")
    private int code;
    @JsonProperty("selection")
    private Selection selection;
    @JsonProperty("message")
    private String message;
    @JsonProperty("autoAcceptedOdds")
    private Odds autoAcceptedOdds;

    public int getCode() {
        return code;
    }

    public void setCode(int value) {
        code = value;
    }

    public Selection getSelection() {
        return selection;
    }

    public void setSelection(Selection value) {
        selection = value;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String value) {
        message = value;
    }

    public Odds getAutoAcceptedOdds() {
        return autoAcceptedOdds;
    }

    public void setAutoAcceptedOdds(Odds value) {
        autoAcceptedOdds = value;
    }

}
