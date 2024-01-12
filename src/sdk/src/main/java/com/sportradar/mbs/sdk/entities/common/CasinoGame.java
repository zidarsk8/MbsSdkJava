package com.sportradar.mbs.sdk.entities.common;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CasinoGame {

    @JsonProperty("provider")
    private String provider;
    @JsonProperty("id")
    private String id;

    public String getProvider() {
        return provider;
    }

    public void setProvider(String value) {
        provider = value;
    }

    public String getId() {
        return id;
    }

    public void setId(String value) {
        id = value;
    }

}
