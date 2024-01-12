package com.sportradar.mbs.sdk.entities.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportradar.mbs.sdk.entities.common.BetValidation;

public class TicketInformRequest extends ContentRequest {

    @JsonProperty("ticket")
    private TicketRequest ticket;
    @JsonProperty("betValidations")
    private BetValidation[] betValidations;

    public TicketRequest getTicket() {
        return ticket;
    }

    public void setTicket(TicketRequest value) {
        ticket = value;
    }

    public BetValidation[] getBetValidations() {
        return betValidations;
    }

    public void setBetValidations(BetValidation[] value) {
        betValidations = value;
    }

}
