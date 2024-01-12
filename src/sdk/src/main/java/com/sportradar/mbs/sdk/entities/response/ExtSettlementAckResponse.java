package com.sportradar.mbs.sdk.entities.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportradar.mbs.sdk.entities.common.AcceptanceStatus;

public class ExtSettlementAckResponse extends ContentResponse {

    @JsonProperty("code")
    private int code;
    @JsonProperty("signature")
    private String signature;
    @JsonProperty("settlementId")
    private String settlementId;
    @JsonProperty("message")
    private String message;
    @JsonProperty("ticketId")
    private String ticketId;
    @JsonProperty("status")
    private AcceptanceStatus status;

    public int getCode() {
        return code;
    }

    public void setCode(int value) {
        code = value;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String value) {
        signature = value;
    }

    public String getSettlementId() {
        return settlementId;
    }

    public void setSettlementId(String value) {
        settlementId = value;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String value) {
        message = value;
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String value) {
        ticketId = value;
    }

    public AcceptanceStatus getStatus() {
        return status;
    }

    public void setStatus(AcceptanceStatus value) {
        status = value;
    }

}
