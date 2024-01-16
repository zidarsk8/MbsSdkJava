package com.sportradar.mbs.sdk.entities.suggestion;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportradar.mbs.sdk.entities.stake.Stake;

public class AltStakeSuggestion extends Suggestion {

    @JsonProperty("stake")
    private Stake[] stake;

    public static Builder newBuilder() {
        return new Builder();
    }

    public Stake[] getStake() {
        return this.stake;
    }

    public void setStake(Stake[] value) {
        this.stake = value;
    }

    public static class Builder {

        private final AltStakeSuggestion instance = new AltStakeSuggestion();

        private Builder() {
        }

        public AltStakeSuggestion build() {
            return this.instance;
        }

        public Builder setStake(Stake... value) {
            this.instance.setStake(value);
            return this;
        }
    }
}
