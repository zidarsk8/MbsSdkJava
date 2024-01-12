package com.sportradar.mbs.sdk.entities.suggestion;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportradar.mbs.sdk.entities.stake.Stake;

public class AltStakeSuggestion extends Suggestion {

    @JsonProperty("stake")
    private Stake[] stake;

    public Stake[] getStake() {
        return stake;
    }

    public void setStake(Stake[] value) {
        stake = value;
    }

}
