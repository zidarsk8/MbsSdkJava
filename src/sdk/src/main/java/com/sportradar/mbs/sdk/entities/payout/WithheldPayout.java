package com.sportradar.mbs.sdk.entities.payout;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class WithheldPayout extends Payout {

    @JsonProperty("traceId")
    private String traceId;
    @JsonProperty("amount")
    private BigDecimal amount;
    @JsonProperty("currency")
    private String currency;

    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String value) {
        traceId = value;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal value) {
        amount = value;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String value) {
        currency = value;
    }

}
