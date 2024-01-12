package com.sportradar.mbs.sdk.entities.stake;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class CashStake extends Stake {

    @JsonProperty("mode")
    private StakeMode mode;
    @JsonProperty("traceId")
    private String traceId;
    @JsonProperty("amount")
    private BigDecimal amount;
    @JsonProperty("currency")
    private String currency;

    public StakeMode getMode() {
        return mode;
    }

    public void setMode(StakeMode value) {
        mode = value;
    }

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
