package com.sportradar.mbs.sdk.entities.balancechangesource;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TicketBalanceChangeSource extends BalanceChangeSource {

    @JsonProperty("action")
    private TicketBalanceChangeAction action;
    @JsonProperty("id")
    private String id;

    public TicketBalanceChangeAction getAction() {
        return action;
    }

    public void setAction(TicketBalanceChangeAction value) {
        action = value;
    }

    public String getId() {
        return id;
    }

    public void setId(String value) {
        id = value;
    }

}
