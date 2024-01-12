package com.sportradar.mbs.sdk.entities.ref;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ReofferTicketRef extends TicketRef {

    @JsonProperty("ticketId")
    private String ticketId;

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String value) {
        ticketId = value;
    }

}
