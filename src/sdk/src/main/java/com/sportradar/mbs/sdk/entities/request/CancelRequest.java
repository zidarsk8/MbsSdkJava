package com.sportradar.mbs.sdk.entities.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportradar.mbs.sdk.entities.cancellation.CancelDetails;

public class CancelRequest extends ContentRequest {

    @JsonProperty("details")
    private CancelDetails details;
    @JsonProperty("cancellationId")
    private String cancellationId;

    public CancelDetails getDetails() {
        return details;
    }

    public void setDetails(CancelDetails value) {
        details = value;
    }

    public String getCancellationId() {
        return cancellationId;
    }

    public void setCancellationId(String value) {
        cancellationId = value;
    }

}
