package com.sportradar.mbs.sdk.entities.odds;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class DecimalOdds extends Odds {

    @JsonProperty("value")
    private BigDecimal value;

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        value = value;
    }

}
