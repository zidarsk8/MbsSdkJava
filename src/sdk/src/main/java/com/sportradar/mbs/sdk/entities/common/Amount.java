package com.sportradar.mbs.sdk.entities.common;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class Amount {

    @JsonProperty("currency")
    private String currency;
    @JsonProperty("value")
    private BigDecimal value;

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String value) {
        currency = value;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        value = value;
    }

}
