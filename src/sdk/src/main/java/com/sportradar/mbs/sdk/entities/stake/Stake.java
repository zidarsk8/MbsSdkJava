package com.sportradar.mbs.sdk.entities.stake;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = FreeCashStake.class, name = "free-cash"),
        @JsonSubTypes.Type(value = FreeRolloverStake.class, name = "free-rollover"),
        @JsonSubTypes.Type(value = BonusStake.class, name = "bonus"),
        @JsonSubTypes.Type(value = FreeStake.class, name = "free"),
        @JsonSubTypes.Type(value = CashStake.class, name = "cash")
})
public class Stake {
}
