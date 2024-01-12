package com.sportradar.mbs.sdk.entities.cancellation;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class TicketPartialCancelDetails extends CancelDetails {

    @JsonProperty("code")
    private int code;
    @JsonProperty("percentage")
    private BigDecimal percentage;
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

    public BigDecimal getPercentage() {
        return percentage;
    }

    public void setPercentage(BigDecimal value) {
        percentage = value;
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
