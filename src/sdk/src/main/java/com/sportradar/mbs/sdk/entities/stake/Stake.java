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

    public static FreeCashStake.Builder newFreeCashStakeBuilder() {
        return FreeCashStake.newBuilder();
    }

    public static FreeRolloverStake.Builder newFreeRolloverStakeBuilder() {
        return FreeRolloverStake.newBuilder();
    }

    public static BonusStake.Builder newBonusStakeBuilder() {
        return BonusStake.newBuilder();
    }

    public static FreeStake.Builder newFreeStakeBuilder() {
        return FreeStake.newBuilder();
    }

    public static CashStake.Builder newCashStakeBuilder() {
        return CashStake.newBuilder();
    }

}
