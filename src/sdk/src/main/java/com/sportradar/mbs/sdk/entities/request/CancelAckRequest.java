package com.sportradar.mbs.sdk.entities.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CancelAckRequest extends ContentRequest {

    @JsonProperty("cancellationSignature")
    private String cancellationSignature;
    @JsonProperty("acknowledged")
    private boolean acknowledged;
    @JsonProperty("cancellationId")
    private String cancellationId;
    @JsonProperty("ticketId")
    private String ticketId;

    public String getCancellationSignature() {
        return cancellationSignature;
    }

    public void setCancellationSignature(String value) {
        cancellationSignature = value;
    }

    public boolean getAcknowledged() {
        return acknowledged;
    }

    public void setAcknowledged(boolean value) {
        acknowledged = value;
    }

    public String getCancellationId() {
        return cancellationId;
    }

    public void setCancellationId(String value) {
        cancellationId = value;
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String value) {
        ticketId = value;
    }

}
