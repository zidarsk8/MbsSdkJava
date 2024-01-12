package com.sportradar.mbs.sdk.entities.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportradar.mbs.sdk.entities.channel.Channel;
import com.sportradar.mbs.sdk.entities.payout.Payout;
import com.sportradar.mbs.sdk.entities.ref.TicketRef;

public class TicketContext {

    @JsonProperty("walletId")
    private String walletId;
    @JsonProperty("ref")
    private TicketRef ref;
    @JsonProperty("channel")
    private Channel channel;
    @JsonProperty("limitId")
    private long limitId;
    @JsonProperty("payoutCap")
    private Payout[] payoutCap;
    @JsonProperty("endCustomer")
    private EndCustomer endCustomer;

    public String getWalletId() {
        return walletId;
    }

    public void setWalletId(String value) {
        walletId = value;
    }

    public TicketRef getRef() {
        return ref;
    }

    public void setRef(TicketRef value) {
        ref = value;
    }

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel value) {
        channel = value;
    }

    public long getLimitId() {
        return limitId;
    }

    public void setLimitId(long value) {
        limitId = value;
    }

    public Payout[] getPayoutCap() {
        return payoutCap;
    }

    public void setPayoutCap(Payout[] value) {
        payoutCap = value;
    }

    public EndCustomer getEndCustomer() {
        return endCustomer;
    }

    public void setEndCustomer(EndCustomer value) {
        endCustomer = value;
    }

}
