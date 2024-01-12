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
}
