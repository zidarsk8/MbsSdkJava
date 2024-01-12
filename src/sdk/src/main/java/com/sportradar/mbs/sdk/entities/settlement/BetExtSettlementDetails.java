package com.sportradar.mbs.sdk.entities.settlement;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportradar.mbs.sdk.entities.payout.Payout;

public class BetExtSettlementDetails extends ExtSettlementDetails {

    @JsonProperty("betId")
    private String betId;
    @JsonProperty("payout")
    private Payout[] payout;
    @JsonProperty("ticketSignature")
    private String ticketSignature;
    @JsonProperty("ticketId")
    private String ticketId;

    public String getBetId() {
        return betId;
    }

    public void setBetId(String value) {
        betId = value;
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
