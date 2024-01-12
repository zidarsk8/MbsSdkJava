package com.sportradar.mbs.sdk.entities.selection;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AccumulatorSelection extends Selection {

    @JsonProperty("selections")
    private Selection[] selections;

    public Selection[] getSelections() {
        return selections;
    }

    public void setSelections(Selection[] value) {
        selections = value;
    }

}
