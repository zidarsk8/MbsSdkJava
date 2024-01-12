package com.sportradar.mbs.sdk.entities.channel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TerminalChannel extends Channel {

    @JsonProperty("terminalId")
    private String terminalId;
    @JsonProperty("shopId")
    private String shopId;
    @JsonProperty("lang")
    private String lang;

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String value) {
        terminalId = value;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String value) {
        shopId = value;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String value) {
        lang = value;
    }

}
