package com.sportradar.mbs.sdk.entities.common;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PaymentGateway {

    @JsonProperty("method")
    private PaymentMethod method;
    @JsonProperty("provider")
    private String provider;
    @JsonProperty("executedAtUtc")
    private long executedAtUtc;
    @JsonProperty("initiatedAtUtc")
    private Long initiatedAtUtc;
    @JsonProperty("referenceId")
    private String referenceId;

    public PaymentMethod getMethod() {
        return method;
    }

    public void setMethod(PaymentMethod value) {
        method = value;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String value) {
        provider = value;
    }

    public long getExecutedAtUtc() {
        return executedAtUtc;
    }

    public void setExecutedAtUtc(long value) {
        executedAtUtc = value;
    }

    public Long getInitiatedAtUtc() {
        return initiatedAtUtc;
    }

    public void setInitiatedAtUtc(Long value) {
        initiatedAtUtc = value;
    }

    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String value) {
        referenceId = value;
    }

}
