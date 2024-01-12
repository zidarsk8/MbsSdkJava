package com.sportradar.mbs.sdk;

import java.net.URI;
import java.time.Duration;
import java.util.function.BiConsumer;

public class MbsSdkConfig {

    private final URI wsServer;
    private final URI authServer;
    private final String authClientId;
    private final String authClientSecret;
    private final String authAudience;
    private final long operatorId;

    private Duration authRequestTimeout;
    private Duration protocolConnectTimeout;
    private Duration authRetryDelay;
    private Integer protocolMaxSendBufferSize;
    private Duration protocolEnqueueTimeout;
    private Duration protocolDequeueTimeout;
    private Duration protocolReceiveResponseTimeout;
    private Integer protocolRetryCount;
    private Integer protocolNumberOfDispatchers;
    private Duration wsReconnectTimeout;
    private Duration wsFetchMessageTimeout;
    private Duration wsSendMessageTimeout;
    private Duration wsReceiveMessageTimeout;
    private Duration wsConsumerGraceTimeout;
    private Duration wsRefreshConnectionTimeout;
    private Integer wsNumberOfConnections;
    private BiConsumer<MbsSdk, Exception> unhandledExceptionHandler;

    public MbsSdkConfig(
            final URI wsServer,
            final URI authServer,
            final String authClientId,
            final String authClientSecret,
            final String authAudience,
            final long operatorId) {
        this.wsServer = wsServer;
        this.authServer = authServer;
        this.authClientId = authClientId;
        this.authClientSecret = authClientSecret;
        this.authAudience = authAudience;
        this.operatorId = operatorId;
    }

    public URI getWsServer() {
        return wsServer;
    }

    public URI getAuthServer() {
        return authServer;
    }

    public String getAuthClientId() {
        return authClientId;
    }

    public String getAuthClientSecret() {
        return authClientSecret;
    }

    public String getAuthAudience() {
        return authAudience;
    }

    public long getOperatorId() {
        return operatorId;
    }

    public Duration getAuthRequestTimeout() {
        return authRequestTimeout;
    }

    public void setAuthRequestTimeout(Duration authRequestTimeout) {
        this.authRequestTimeout = authRequestTimeout;
    }

    public Duration getProtocolConnectTimeout() {
        return protocolConnectTimeout;
    }

    public void setProtocolConnectTimeout(Duration protocolConnectTimeout) {
        this.protocolConnectTimeout = protocolConnectTimeout;
    }

    public Duration getAuthRetryDelay() {
        return authRetryDelay;
    }

    public void setAuthRetryDelay(Duration authRetryDelay) {
        this.authRetryDelay = authRetryDelay;
    }

    public Integer getProtocolMaxSendBufferSize() {
        return protocolMaxSendBufferSize;
    }

    public void setProtocolMaxSendBufferSize(Integer protocolMaxSendBufferSize) {
        this.protocolMaxSendBufferSize = protocolMaxSendBufferSize;
    }

    public Duration getProtocolEnqueueTimeout() {
        return protocolEnqueueTimeout;
    }

    public void setProtocolEnqueueTimeout(Duration protocolEnqueueTimeout) {
        this.protocolEnqueueTimeout = protocolEnqueueTimeout;
    }

    public Duration getProtocolDequeueTimeout() {
        return protocolDequeueTimeout;
    }

    public void setProtocolDequeueTimeout(Duration protocolDequeueTimeout) {
        this.protocolDequeueTimeout = protocolDequeueTimeout;
    }

    public Duration getProtocolReceiveResponseTimeout() {
        return protocolReceiveResponseTimeout;
    }

    public void setProtocolReceiveResponseTimeout(Duration protocolReceiveResponseTimeout) {
        this.protocolReceiveResponseTimeout = protocolReceiveResponseTimeout;
    }

    public Integer getProtocolRetryCount() {
        return protocolRetryCount;
    }

    public void setProtocolRetryCount(Integer protocolRetryCount) {
        this.protocolRetryCount = protocolRetryCount;
    }

    public Integer getProtocolNumberOfDispatchers() {
        return protocolNumberOfDispatchers;
    }

    public void setProtocolNumberOfDispatchers(Integer protocolNumberOfDispatchers) {
        this.protocolNumberOfDispatchers = protocolNumberOfDispatchers;
    }

    public Duration getWsReconnectTimeout() {
        return wsReconnectTimeout;
    }

    public void setWsReconnectTimeout(Duration wsReconnectTimeout) {
        this.wsReconnectTimeout = wsReconnectTimeout;
    }

    public Duration getWsFetchMessageTimeout() {
        return wsFetchMessageTimeout;
    }

    public void setWsFetchMessageTimeout(Duration wsFetchMessageTimeout) {
        this.wsFetchMessageTimeout = wsFetchMessageTimeout;
    }

    public Duration getWsSendMessageTimeout() {
        return wsSendMessageTimeout;
    }

    public void setWsSendMessageTimeout(Duration wsSendMessageTimeout) {
        this.wsSendMessageTimeout = wsSendMessageTimeout;
    }

    public Duration getWsReceiveMessageTimeout() {
        return wsReceiveMessageTimeout;
    }

    public void setWsReceiveMessageTimeout(Duration wsReceiveMessageTimeout) {
        this.wsReceiveMessageTimeout = wsReceiveMessageTimeout;
    }

    public Duration getWsConsumerGraceTimeout() {
        return wsConsumerGraceTimeout;
    }

    public void setWsConsumerGraceTimeout(Duration wsConsumerGraceTimeout) {
        this.wsConsumerGraceTimeout = wsConsumerGraceTimeout;
    }

    public Duration getWsRefreshConnectionTimeout() {
        return wsRefreshConnectionTimeout;
    }

    public void setWsRefreshConnectionTimeout(Duration wsRefreshConnectionTimeout) {
        this.wsRefreshConnectionTimeout = wsRefreshConnectionTimeout;
    }

    public Integer getWsNumberOfConnections() {
        return wsNumberOfConnections;
    }

    public void setWsNumberOfConnections(Integer wsNumberOfConnections) {
        this.wsNumberOfConnections = wsNumberOfConnections;
    }

    public BiConsumer<MbsSdk, Exception> getUnhandledExceptionHandler() {
        return unhandledExceptionHandler;
    }

    public void setUnhandledExceptionHandler(BiConsumer<MbsSdk, Exception> unhandledExceptionHandler) {
        this.unhandledExceptionHandler = unhandledExceptionHandler;
    }
}
