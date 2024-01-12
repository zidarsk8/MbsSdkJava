package com.sportradar.mbs.sdk.entities.balancechangesource;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WithdrawalBalanceChangeSource extends BalanceChangeSource {

    @JsonProperty("id")
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String value) {
        id = value;
    }

}
