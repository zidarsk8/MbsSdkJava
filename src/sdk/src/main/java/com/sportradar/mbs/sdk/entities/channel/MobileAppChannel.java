package com.sportradar.mbs.sdk.entities.channel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MobileAppChannel extends Channel {

    @JsonProperty("ip")
    private String ip;
    @JsonProperty("lang")
    private String lang;
    @JsonProperty("deviceId")
    private String deviceId;

    public String getIp() {
        return ip;
    }

    public void setIp(String value) {
        ip = value;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String value) {
        lang = value;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String value) {
        deviceId = value;
    }

}
