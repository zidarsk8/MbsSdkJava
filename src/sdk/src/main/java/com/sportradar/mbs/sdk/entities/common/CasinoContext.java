package com.sportradar.mbs.sdk.entities.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportradar.mbs.sdk.entities.channel.Channel;

public class CasinoContext {

    @JsonProperty("walletId")
    private String walletId;
    @JsonProperty("channel")
    private Channel channel;
    @JsonProperty("endCustomer")
    private EndCustomer endCustomer;

    public String getWalletId() {
        return walletId;
    }

    public void setWalletId(String value) {
        walletId = value;
    }

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel value) {
        channel = value;
    }

    public EndCustomer getEndCustomer() {
        return endCustomer;
    }

    public void setEndCustomer(EndCustomer value) {
        endCustomer = value;
    }

}
