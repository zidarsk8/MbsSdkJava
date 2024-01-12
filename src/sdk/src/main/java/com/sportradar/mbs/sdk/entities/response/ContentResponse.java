package com.sportradar.mbs.sdk.entities.response;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = DepositInformResponse.class, name = "deposit-inform-reply"),
        @JsonSubTypes.Type(value = ExtSettlementAckResponse.class, name = "ext-settlement-ack-reply"),
        @JsonSubTypes.Type(value = CashoutResponse.class, name = "cashout-reply"),
        @JsonSubTypes.Type(value = TicketInformResponse.class, name = "ticket-inform-reply"),
        @JsonSubTypes.Type(value = CancelAckResponse.class, name = "cancel-ack-reply"),
        @JsonSubTypes.Type(value = CancelResponse.class, name = "cancel-reply"),
        @JsonSubTypes.Type(value = ErrorResponse.class, name = "error-reply"),
        @JsonSubTypes.Type(value = CasinoSessionsResponse.class, name = "casino-sessions-inform-reply"),
        @JsonSubTypes.Type(value = TicketAckResponse.class, name = "ticket-ack-reply"),
        @JsonSubTypes.Type(value = BalanceChangeInformResponse.class, name = "balance-change-inform-reply"),
        @JsonSubTypes.Type(value = ExtSettlementResponse.class, name = "ext-settlement-reply"),
        @JsonSubTypes.Type(value = CashoutAckResponse.class, name = "cashout-ack-reply"),
        @JsonSubTypes.Type(value = TicketResponse.class, name = "ticket-reply"),
        @JsonSubTypes.Type(value = WithdrawalInformResponse.class, name = "withdrawal-inform-reply")
})
public class ContentResponse {
}
