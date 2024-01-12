package com.sportradar.mbs.sdk.entities.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CashoutAckRequest extends ContentRequest {

    @JsonProperty("acknowledged")
    private boolean acknowledged;
    @JsonProperty("cashoutId")
    private String cashoutId;
    @JsonProperty("cashoutSignature")
    private String cashoutSignature;
    @JsonProperty("ticketId")
    private String ticketId;

    public boolean getAcknowledged() {
        return acknowledged;
    }

    public void setAcknowledged(boolean value) {
        acknowledged = value;
    }

    public String getCashoutId() {
        return cashoutId;
    }

    public void setCashoutId(String value) {
        cashoutId = value;
    }

    public String getCashoutSignature() {
        return cashoutSignature;
    }

    public void setCashoutSignature(String value) {
        cashoutSignature = value;
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String value) {
        ticketId = value;
    }

}
