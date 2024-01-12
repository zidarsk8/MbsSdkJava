package com.sportradar.mbs.sdk.entities.balancechangesource;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = TicketBalanceChangeSource.class, name = "ticket"),
        @JsonSubTypes.Type(value = DepositBalanceChangeSource.class, name = "deposit"),
        @JsonSubTypes.Type(value = WithdrawalBalanceChangeSource.class, name = "withdrawal")
})
public class BalanceChangeSource {
}
