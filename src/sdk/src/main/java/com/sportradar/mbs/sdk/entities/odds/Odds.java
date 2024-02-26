package com.sportradar.mbs.sdk.entities.odds;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Represents the odds for a particular event.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = DecimalOdds.class, name = "decimal")
})
public class Odds {

    /**
     * Creates a new builder for DecimalOdds.
     *
     * @return a new instance of DecimalOdds.Builder
     */
    public static DecimalOdds.Builder newDecimalOddsBuilder() {
        return DecimalOdds.newBuilder();
    }

}
