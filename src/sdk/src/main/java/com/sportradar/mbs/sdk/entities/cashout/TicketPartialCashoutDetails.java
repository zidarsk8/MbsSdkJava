package com.sportradar.mbs.sdk.entities.cashout;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportradar.mbs.sdk.entities.payout.Payout;

import java.math.BigDecimal;

public class TicketPartialCashoutDetails extends CashoutDetails {

    @JsonProperty("code")
    private int code;
    @JsonProperty("percentage")
    private BigDecimal percentage;
    @JsonProperty("payout")
    private Payout[] payout;
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

    public Payout[] getPayout() {
        return payout;
    }

    public void setPayout(Payout[] value) {
        payout = value;
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
