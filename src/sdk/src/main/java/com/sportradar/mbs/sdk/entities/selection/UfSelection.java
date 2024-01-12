package com.sportradar.mbs.sdk.entities.selection;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportradar.mbs.sdk.entities.odds.Odds;

public class UfSelection extends Selection {

    @JsonProperty("eventId")
    private String eventId;
    @JsonProperty("productId")
    private String productId;
    @JsonProperty("odds")
    private Odds odds;
    @JsonProperty("outcomeId")
    private String outcomeId;
    @JsonProperty("specifiers")
    private String specifiers;
    @JsonProperty("marketId")
    private String marketId;

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String value) {
        eventId = value;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String value) {
        productId = value;
    }

    public Odds getOdds() {
        return odds;
    }

    public void setOdds(Odds value) {
        odds = value;
    }

    public String getOutcomeId() {
        return outcomeId;
    }

    public void setOutcomeId(String value) {
        outcomeId = value;
    }

    public String getSpecifiers() {
        return specifiers;
    }

    public void setSpecifiers(String value) {
        specifiers = value;
    }

    public String getMarketId() {
        return marketId;
    }

    public void setMarketId(String value) {
        marketId = value;
    }

}
