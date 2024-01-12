package com.sportradar.mbs.sdk.entities.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportradar.mbs.sdk.entities.payout.Payout;

public class BetContext {

    @JsonProperty("oddsChange")
    private OddsChange oddsChange;
    @JsonProperty("payoutCap")
    private Payout[] payoutCap;

    public OddsChange getOddsChange() {
        return oddsChange;
    }

    public void setOddsChange(OddsChange value) {
        oddsChange = value;
    }

    public Payout[] getPayoutCap() {
        return payoutCap;
    }

    public void setPayoutCap(Payout[] value) {
        payoutCap = value;
    }

}
