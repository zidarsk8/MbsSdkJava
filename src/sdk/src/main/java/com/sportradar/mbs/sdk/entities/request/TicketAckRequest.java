package com.sportradar.mbs.sdk.entities.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TicketAckRequest extends ContentRequest {

    @JsonProperty("acknowledged")
    private boolean acknowledged;
    @JsonProperty("ticketSignature")
    private String ticketSignature;
    @JsonProperty("ticketId")
    private String ticketId;

    public boolean getAcknowledged() {
        return acknowledged;
    }

    public void setAcknowledged(boolean value) {
        acknowledged = value;
    }

    public String getTicketSignature() {
        return ticketSignature;
    }

    public void setTicketSignature(String value) {
        ticketSignature = value;
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String value) {
        ticketId = value;
    }

}
