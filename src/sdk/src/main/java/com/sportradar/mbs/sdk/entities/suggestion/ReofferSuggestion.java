package com.sportradar.mbs.sdk.entities.suggestion;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportradar.mbs.sdk.entities.stake.Stake;

public class ReofferSuggestion extends Suggestion {

    @JsonProperty("mode")
    private String mode;
    @JsonProperty("stake")
    private Stake[] stake;

    public String getMode() {
        return mode;
    }

    public void setMode(String value) {
        mode = value;
    }

    public Stake[] getStake() {
        return stake;
    }

    public void setStake(Stake[] value) {
        stake = value;
    }

}
