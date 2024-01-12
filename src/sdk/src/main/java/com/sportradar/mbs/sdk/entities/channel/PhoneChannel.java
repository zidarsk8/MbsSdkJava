package com.sportradar.mbs.sdk.entities.channel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PhoneChannel extends Channel {

    @JsonProperty("lang")
    private String lang;

    public String getLang() {
        return lang;
    }

    public void setLang(String value) {
        lang = value;
    }

}
