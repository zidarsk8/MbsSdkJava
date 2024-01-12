package com.sportradar.mbs.sdk.entities.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportradar.mbs.sdk.entities.settlement.ExtSettlementDetails;

public class ExtSettlementRequest extends ContentRequest {

    @JsonProperty("details")
    private ExtSettlementDetails details;
    @JsonProperty("settlementId")
    private String settlementId;

    public ExtSettlementDetails getDetails() {
        return details;
    }

    public void setDetails(ExtSettlementDetails value) {
        details = value;
    }

    public String getSettlementId() {
        return settlementId;
    }

    public void setSettlementId(String value) {
        settlementId = value;
    }

}
