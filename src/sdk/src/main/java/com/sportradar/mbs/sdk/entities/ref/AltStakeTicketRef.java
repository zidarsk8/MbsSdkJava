package com.sportradar.mbs.sdk.entities.ref;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AltStakeTicketRef extends TicketRef {

    @JsonProperty("ticketId")
    private String ticketId;

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getTicketId() {
        return this.ticketId;
    }

    public void setTicketId(String value) {
        this.ticketId = value;
    }

    public static class Builder {

        private final AltStakeTicketRef instance = new AltStakeTicketRef();

        private Builder() {
        }

        public AltStakeTicketRef build() {
            return this.instance;
        }

        public Builder setTicketId(String value) {
            this.instance.setTicketId(value);
            return this;
        }
    }
}
