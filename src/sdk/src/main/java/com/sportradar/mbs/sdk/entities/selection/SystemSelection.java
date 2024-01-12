package com.sportradar.mbs.sdk.entities.selection;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SystemSelection extends Selection {

    @JsonProperty("selections")
    private Selection[] selections;
    @JsonProperty("size")
    private int[] size;

    public Selection[] getSelections() {
        return selections;
    }

    public void setSelections(Selection[] value) {
        selections = value;
    }

    public int[] getSize() {
        return size;
    }

    public void setSize(int[] value) {
        size = value;
    }

}
