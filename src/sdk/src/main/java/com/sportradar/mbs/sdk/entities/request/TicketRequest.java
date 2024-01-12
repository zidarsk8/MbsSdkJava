package com.sportradar.mbs.sdk.entities.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportradar.mbs.sdk.entities.common.Bet;
import com.sportradar.mbs.sdk.entities.common.TicketContext;

public class TicketRequest extends ContentRequest {

    @JsonProperty("context")
    private TicketContext context;
    @JsonProperty("bets")
    private Bet[] bets;
    @JsonProperty("ticketId")
    private String ticketId;

    public TicketContext getContext() {
        return context;
    }

    public void setContext(TicketContext value) {
        context = value;
    }

    public Bet[] getBets() {
        return bets;
    }

    public void setBets(Bet[] value) {
        bets = value;
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String value) {
        ticketId = value;
    }

}
