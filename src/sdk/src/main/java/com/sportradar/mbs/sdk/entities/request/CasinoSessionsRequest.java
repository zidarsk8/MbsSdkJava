package com.sportradar.mbs.sdk.entities.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportradar.mbs.sdk.entities.common.CasinoContext;
import com.sportradar.mbs.sdk.entities.common.CasinoSession;

public class CasinoSessionsRequest extends ContentRequest {

    @JsonProperty("sessions")
    private CasinoSession[] sessions;
    @JsonProperty("reportId")
    private String reportId;
    @JsonProperty("context")
    private CasinoContext context;

    public CasinoSession[] getSessions() {
        return sessions;
    }

    public void setSessions(CasinoSession[] value) {
        sessions = value;
    }

    public String getReportId() {
        return reportId;
    }

    public void setReportId(String value) {
        reportId = value;
    }

    public CasinoContext getContext() {
        return context;
    }

    public void setContext(CasinoContext value) {
        context = value;
    }

}
