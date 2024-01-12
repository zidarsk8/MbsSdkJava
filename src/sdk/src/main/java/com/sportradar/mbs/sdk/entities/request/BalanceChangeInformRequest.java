package com.sportradar.mbs.sdk.entities.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportradar.mbs.sdk.entities.balancechangesource.BalanceChangeSource;
import com.sportradar.mbs.sdk.entities.common.Amount;
import com.sportradar.mbs.sdk.entities.common.BalanceChangeStatus;
import com.sportradar.mbs.sdk.entities.common.EndCustomer;

public class BalanceChangeInformRequest extends ContentRequest {

    @JsonProperty("walletId")
    private String walletId;
    @JsonProperty("balanceChangeId")
    private String balanceChangeId;
    @JsonProperty("amount")
    private Amount amount;
    @JsonProperty("endCustomer")
    private EndCustomer endCustomer;
    @JsonProperty("executedAtUtc")
    private long executedAtUtc;
    @JsonProperty("source")
    private BalanceChangeSource source;
    @JsonProperty("status")
    private BalanceChangeStatus status;

    public String getWalletId() {
        return walletId;
    }

    public void setWalletId(String value) {
        walletId = value;
    }

    public String getBalanceChangeId() {
        return balanceChangeId;
    }

    public void setBalanceChangeId(String value) {
        balanceChangeId = value;
    }

    public Amount getAmount() {
        return amount;
    }

    public void setAmount(Amount value) {
        amount = value;
    }

    public EndCustomer getEndCustomer() {
        return endCustomer;
    }

    public void setEndCustomer(EndCustomer value) {
        endCustomer = value;
    }

    public long getExecutedAtUtc() {
        return executedAtUtc;
    }

    public void setExecutedAtUtc(long value) {
        executedAtUtc = value;
    }

    public BalanceChangeSource getSource() {
        return source;
    }

    public void setSource(BalanceChangeSource value) {
        source = value;
    }

    public BalanceChangeStatus getStatus() {
        return status;
    }

    public void setStatus(BalanceChangeStatus value) {
        status = value;
    }

}
