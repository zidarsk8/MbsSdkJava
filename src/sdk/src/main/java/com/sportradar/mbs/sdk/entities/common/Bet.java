package com.sportradar.mbs.sdk.entities.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportradar.mbs.sdk.entities.selection.Selection;
import com.sportradar.mbs.sdk.entities.stake.Stake;

public class Bet {

    @JsonProperty("stake")
    private Stake[] stake;
    @JsonProperty("selections")
    private Selection[] selections;
    @JsonProperty("betId")
    private String betId;
    @JsonProperty("context")
    private BetContext context;

    public Stake[] getStake() {
        return stake;
    }

    public void setStake(Stake[] value) {
        stake = value;
    }

    public Selection[] getSelections() {
        return selections;
    }

    public void setSelections(Selection[] value) {
        selections = value;
    }

    public String getBetId() {
        return betId;
    }

    public void setBetId(String value) {
        betId = value;
    }

    public BetContext getContext() {
        return context;
    }

    public void setContext(BetContext value) {
        context = value;
    }

}
