package com.sportradar.mbs.sdk.entities.casinospin;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BonusCasinoSpin extends CasinoSpin {

    @JsonProperty("count")
    private int count;
    @JsonProperty("winningCount")
    private Integer winningCount;

    public int getCount() {
        return count;
    }

    public void setCount(int value) {
        count = value;
    }

    public Integer getWinningCount() {
        return winningCount;
    }

    public void setWinningCount(Integer value) {
        winningCount = value;
    }

}
