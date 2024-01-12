package com.sportradar.mbs.sdk.entities.internal;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportradar.mbs.sdk.entities.response.ContentResponse;

public class Response {

    @JsonProperty("correlationId")
    private String correlationId;
    @JsonProperty("timestampUtc")
    private long timestampUtc;
    @JsonProperty("operation")
    private String operation;
    @JsonProperty("version")
    private String version;
    @JsonProperty("content")
    private ContentResponse content;

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

    public ContentResponse getContent() {
        return content;
    }

    public void setContent(ContentResponse value) {
        content = value;
    }

}
