package com.sportradar.mbs.sdk.entities.common;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class EndCustomer {

    @JsonProperty("confidence")
    private BigDecimal confidence;
    @JsonProperty("id")
    private String id;

    public BigDecimal getConfidence() {
        return confidence;
    }

    public void setConfidence(BigDecimal value) {
        confidence = value;
    }

    public String getId() {
        return id;
    }

    public void setId(String value) {
        id = value;
    }

}
