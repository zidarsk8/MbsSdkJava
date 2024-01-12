package com.sportradar.mbs.sdk.entities.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportradar.mbs.sdk.entities.common.Amount;
import com.sportradar.mbs.sdk.entities.common.BalanceMoveStatus;
import com.sportradar.mbs.sdk.entities.common.EndCustomer;
import com.sportradar.mbs.sdk.entities.common.PaymentGateway;

public class DepositInformRequest extends ContentRequest {

    @JsonProperty("walletId")
    private String walletId;
    @JsonProperty("depositId")
    private String depositId;
    @JsonProperty("amount")
    private Amount amount;
    @JsonProperty("endCustomer")
    private EndCustomer endCustomer;
    @JsonProperty("executedAtUtc")
    private long executedAtUtc;
    @JsonProperty("initiatedAtUtc")
    private Long initiatedAtUtc;
    @JsonProperty("gateway")
    private PaymentGateway gateway;
    @JsonProperty("status")
    private BalanceMoveStatus status;

    public String getWalletId() {
        return walletId;
    }

    public void setWalletId(String value) {
        walletId = value;
    }

    public String getDepositId() {
        return depositId;
    }

    public void setDepositId(String value) {
        depositId = value;
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

    public Long getInitiatedAtUtc() {
        return initiatedAtUtc;
    }

    public void setInitiatedAtUtc(Long value) {
        initiatedAtUtc = value;
    }

    public PaymentGateway getGateway() {
        return gateway;
    }

    public void setGateway(PaymentGateway value) {
        gateway = value;
    }

    public BalanceMoveStatus getStatus() {
        return status;
    }

    public void setStatus(BalanceMoveStatus value) {
        status = value;
    }

}
