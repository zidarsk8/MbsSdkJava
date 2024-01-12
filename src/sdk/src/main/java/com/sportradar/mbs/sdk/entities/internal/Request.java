package com.sportradar.mbs.sdk.entities.internal;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportradar.mbs.sdk.entities.request.ContentRequest;

public class Request {

    @JsonProperty("correlationId")
    private String correlationId;
    @JsonProperty("timestampUtc")
    private long timestampUtc;
    @JsonProperty("operatorId")
    private long operatorId;
    @JsonProperty("operation")
    private String operation;
    @JsonProperty("version")
    private String version;
    @JsonProperty("content")
    private ContentRequest content;

    public String getCorrelationId() {
        return correlationId;
    }

    public void setCorrelationId(String value) {
        correlationId = value;
    }

    public long getTimestampUtc() {
        return timestampUtc;
    }

    public void setTimestampUtc(long value) {
        timestampUtc = value;
    }

    public long getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(long value) {
        operatorId = value;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String value) {
        operation = value;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String value) {
        version = value;
    }

    public ContentRequest getContent() {
        return content;
    }

    public void setContent(ContentRequest value) {
        content = value;
    }

}
