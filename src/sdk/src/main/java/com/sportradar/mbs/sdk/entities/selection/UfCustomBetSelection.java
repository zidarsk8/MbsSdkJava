package com.sportradar.mbs.sdk.entities.selection;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportradar.mbs.sdk.entities.odds.Odds;

public class UfCustomBetSelection extends Selection {

    @JsonProperty("selections")
    private UfSelection[] selections;
    @JsonProperty("odds")
    private Odds odds;

    public UfSelection[] getSelections() {
        return selections;
    }

    public void setSelections(UfSelection[] value) {
        selections = value;
    }

    public Odds getOdds() {
        return odds;
    }

    public void setOdds(Odds value) {
        odds = value;
    }

}
