package com.sportradar.mbs.sdk.entities.cancellation;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BetCancelDetails extends CancelDetails {

    @JsonProperty("code")
    private int code;
    @JsonProperty("betId")
    private String betId;
    @JsonProperty("ticketSignature")
    private String ticketSignature;
    @JsonProperty("ticketId")
    private String ticketId;

    public int getCode() {
        return code;
    }

    public void setCode(int value) {
        code = value;
    }

    public String getBetId() {
        return betId;
    }

    public void setBetId(String value) {
        betId = value;
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
