package com.sportradar.mbs.sdk.entities.common;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class ExchangeRate {

    @JsonProperty("toCurrency")
    private String toCurrency;
    @JsonProperty("rate")
    private BigDecimal rate;
    @JsonProperty("fromCurrency")
    private String fromCurrency;

    public String getToCurrency() {
        return toCurrency;
    }

    public void setToCurrency(String value) {
        toCurrency = value;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal value) {
        rate = value;
    }

    public String getFromCurrency() {
        return fromCurrency;
    }

    public void setFromCurrency(String value) {
        fromCurrency = value;
    }

}
