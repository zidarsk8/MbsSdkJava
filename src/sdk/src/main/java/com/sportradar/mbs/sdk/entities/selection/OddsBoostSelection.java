package com.sportradar.mbs.sdk.entities.selection;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportradar.mbs.sdk.entities.odds.Odds;

public class OddsBoostSelection extends Selection {

    @JsonProperty("selection")
    private Selection selection;
    @JsonProperty("odds")
    private Odds odds;

    public Selection getSelection() {
        return selection;
    }

    public void setSelection(Selection value) {
        selection = value;
    }

    public Odds getOdds() {
        return odds;
    }

    public void setOdds(Odds value) {
        odds = value;
    }

}
