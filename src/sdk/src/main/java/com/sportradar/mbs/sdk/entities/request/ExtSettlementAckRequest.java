package com.sportradar.mbs.sdk.entities.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExtSettlementAckRequest extends ContentRequest {

    @JsonProperty("acknowledged")
    private boolean acknowledged;
    @JsonProperty("settlementSignature")
    private String settlementSignature;
    @JsonProperty("settlementId")
    private String settlementId;
    @JsonProperty("ticketId")
    private String ticketId;

    public boolean getAcknowledged() {
        return acknowledged;
    }

    public void setAcknowledged(boolean value) {
        acknowledged = value;
    }

    public String getSettlementSignature() {
        return settlementSignature;
    }

    public void setSettlementSignature(String value) {
        settlementSignature = value;
    }

    public String getSettlementId() {
        return settlementId;
    }

    public void setSettlementId(String value) {
        settlementId = value;
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String value) {
        ticketId = value;
    }

}
