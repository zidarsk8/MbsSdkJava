package com.sportradar.mbs.sdk.entities.selection;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportradar.mbs.sdk.entities.odds.Odds;

public class ExtSelection extends Selection {

    @JsonProperty("expSettleTime")
    private long expSettleTime;
    @JsonProperty("odds")
    private Odds odds;
    @JsonProperty("event")
    private String event;
    @JsonProperty("outcome")
    private String outcome;

    public long getExpSettleTime() {
        return expSettleTime;
    }

    public void setExpSettleTime(long value) {
        expSettleTime = value;
    }

    public Odds getOdds() {
        return odds;
    }

    public void setOdds(Odds value) {
        odds = value;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String value) {
        event = value;
    }

    public String getOutcome() {
        return outcome;
    }

    public void setOutcome(String value) {
        outcome = value;
    }

}
