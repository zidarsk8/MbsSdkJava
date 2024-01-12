package com.sportradar.mbs.sdk.entities.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportradar.mbs.sdk.entities.common.AcceptanceStatus;
import com.sportradar.mbs.sdk.entities.common.BetDetail;
import com.sportradar.mbs.sdk.entities.common.ExchangeRate;

public class TicketInformResponse extends ContentResponse {

    @JsonProperty("code")
    private int code;
    @JsonProperty("exchangeRate")
    private ExchangeRate[] exchangeRate;
    @JsonProperty("signature")
    private String signature;
    @JsonProperty("betDetails")
    private BetDetail[] betDetails;
    @JsonProperty("message")
    private String message;
    @JsonProperty("ticketId")
    private String ticketId;
    @JsonProperty("status")
    private AcceptanceStatus status;

    public int getCode() {
        return code;
    }

    public void setCode(int value) {
        code = value;
    }

    public ExchangeRate[] getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(ExchangeRate[] value) {
        exchangeRate = value;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String value) {
        signature = value;
    }

    public BetDetail[] getBetDetails() {
        return betDetails;
    }

    public void setBetDetails(BetDetail[] value) {
        betDetails = value;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String value) {
        message = value;
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String value) {
        ticketId = value;
    }

    public AcceptanceStatus getStatus() {
        return status;
    }

    public void setStatus(AcceptanceStatus value) {
        status = value;
    }

}
