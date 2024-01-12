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
}
