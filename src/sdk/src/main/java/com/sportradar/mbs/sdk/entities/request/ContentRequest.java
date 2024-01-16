package com.sportradar.mbs.sdk.entities.request;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = CancelRequest.class, name = "cancel"),
        @JsonSubTypes.Type(value = TicketInformRequest.class, name = "ticket-inform"),
        @JsonSubTypes.Type(value = TicketRequest.class, name = "ticket"),
        @JsonSubTypes.Type(value = CashoutAckRequest.class, name = "cashout-ack"),
        @JsonSubTypes.Type(value = DepositInformRequest.class, name = "deposit-inform"),
        @JsonSubTypes.Type(value = CashoutRequest.class, name = "cashout"),
        @JsonSubTypes.Type(value = CasinoSessionsRequest.class, name = "casino-sessions-inform"),
        @JsonSubTypes.Type(value = TicketAckRequest.class, name = "ticket-ack"),
        @JsonSubTypes.Type(value = ExtSettlementRequest.class, name = "ext-settlement"),
        @JsonSubTypes.Type(value = CancelAckRequest.class, name = "cancel-ack"),
        @JsonSubTypes.Type(value = WithdrawalInformRequest.class, name = "withdrawal-inform"),
        @JsonSubTypes.Type(value = ExtSettlementAckRequest.class, name = "ext-settlement-ack"),
        @JsonSubTypes.Type(value = BalanceChangeInformRequest.class, name = "balance-change-inform")
})
public class ContentRequest {

    public static CancelRequest.Builder newCancelRequestBuilder() {
        return CancelRequest.newBuilder();
    }

    public static TicketInformRequest.Builder newTicketInformRequestBuilder() {
        return TicketInformRequest.newBuilder();
    }

    public static TicketRequest.Builder newTicketRequestBuilder() {
        return TicketRequest.newBuilder();
    }

    public static CashoutAckRequest.Builder newCashoutAckRequestBuilder() {
        return CashoutAckRequest.newBuilder();
    }

    public static DepositInformRequest.Builder newDepositInformRequestBuilder() {
        return DepositInformRequest.newBuilder();
    }

    public static CashoutRequest.Builder newCashoutRequestBuilder() {
        return CashoutRequest.newBuilder();
    }

    public static CasinoSessionsRequest.Builder newCasinoSessionsRequestBuilder() {
        return CasinoSessionsRequest.newBuilder();
    }

    public static TicketAckRequest.Builder newTicketAckRequestBuilder() {
        return TicketAckRequest.newBuilder();
    }

    public static ExtSettlementRequest.Builder newExtSettlementRequestBuilder() {
        return ExtSettlementRequest.newBuilder();
    }

    public static CancelAckRequest.Builder newCancelAckRequestBuilder() {
        return CancelAckRequest.newBuilder();
    }

    public static WithdrawalInformRequest.Builder newWithdrawalInformRequestBuilder() {
        return WithdrawalInformRequest.newBuilder();
    }

    public static ExtSettlementAckRequest.Builder newExtSettlementAckRequestBuilder() {
        return ExtSettlementAckRequest.newBuilder();
    }

    public static BalanceChangeInformRequest.Builder newBalanceChangeInformRequestBuilder() {
        return BalanceChangeInformRequest.newBuilder();
    }

}
