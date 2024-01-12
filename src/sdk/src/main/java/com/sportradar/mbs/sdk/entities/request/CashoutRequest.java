package com.sportradar.mbs.sdk.entities.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportradar.mbs.sdk.entities.cashout.CashoutDetails;

public class CashoutRequest extends ContentRequest {

    @JsonProperty("cashoutId")
    private String cashoutId;
    @JsonProperty("details")
    private CashoutDetails details;

    public String getCashoutId() {
        return cashoutId;
    }

    public void setCashoutId(String value) {
        cashoutId = value;
    }

    public CashoutDetails getDetails() {
        return details;
    }

    public void setDetails(CashoutDetails value) {
        details = value;
    }

}
