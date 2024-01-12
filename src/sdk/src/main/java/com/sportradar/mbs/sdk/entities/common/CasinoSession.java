package com.sportradar.mbs.sdk.entities.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportradar.mbs.sdk.entities.casinospin.CasinoSpin;
import com.sportradar.mbs.sdk.entities.payout.Payout;
import com.sportradar.mbs.sdk.entities.stake.Stake;

public class CasinoSession {

    @JsonProperty("stake")
    private Stake[] stake;
    @JsonProperty("game")
    private CasinoGame game;
    @JsonProperty("spins")
    private CasinoSpin[] spins;
    @JsonProperty("payout")
    private Payout[] payout;
    @JsonProperty("id")
    private String id;
    @JsonProperty("startUtc")
    private Long startUtc;
    @JsonProperty("endUtc")
    private Long endUtc;

    public Stake[] getStake() {
        return stake;
    }

    public void setStake(Stake[] value) {
        stake = value;
    }

    public CasinoGame getGame() {
        return game;
    }

    public void setGame(CasinoGame value) {
        game = value;
    }

    public CasinoSpin[] getSpins() {
        return spins;
    }

    public void setSpins(CasinoSpin[] value) {
        spins = value;
    }

    public Payout[] getPayout() {
        return payout;
    }

    public void setPayout(Payout[] value) {
        payout = value;
    }

    public String getId() {
        return id;
    }

    public void setId(String value) {
        id = value;
    }

    public Long getStartUtc() {
        return startUtc;
    }

    public void setStartUtc(Long value) {
        startUtc = value;
    }

    public Long getEndUtc() {
        return endUtc;
    }

    public void setEndUtc(Long value) {
        endUtc = value;
    }

}
