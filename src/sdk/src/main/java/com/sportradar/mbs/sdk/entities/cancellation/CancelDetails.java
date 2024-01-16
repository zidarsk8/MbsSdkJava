package com.sportradar.mbs.sdk.entities.cancellation;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = BetCancelDetails.class, name = "bet"),
        @JsonSubTypes.Type(value = ReofferCancelDetails.class, name = "reoffer"),
        @JsonSubTypes.Type(value = TicketPartialCancelDetails.class, name = "ticket-partial"),
        @JsonSubTypes.Type(value = TicketCancelDetails.class, name = "ticket"),
        @JsonSubTypes.Type(value = BetPartialCancelDetails.class, name = "bet-partial")
})
public class CancelDetails {

    public static BetCancelDetails.Builder newBetCancelDetailsBuilder() {
        return BetCancelDetails.newBuilder();
    }

    public static ReofferCancelDetails.Builder newReofferCancelDetailsBuilder() {
        return ReofferCancelDetails.newBuilder();
    }

    public static TicketPartialCancelDetails.Builder newTicketPartialCancelDetailsBuilder() {
        return TicketPartialCancelDetails.newBuilder();
    }

    public static TicketCancelDetails.Builder newTicketCancelDetailsBuilder() {
        return TicketCancelDetails.newBuilder();
    }

    public static BetPartialCancelDetails.Builder newBetPartialCancelDetailsBuilder() {
        return BetPartialCancelDetails.newBuilder();
    }

}
