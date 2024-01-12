package com.sportradar.mbs.sdk.internal.protocol;

import com.sportradar.mbs.sdk.entities.request.*;
import com.sportradar.mbs.sdk.entities.response.*;
import com.sportradar.mbs.sdk.protocol.TicketProtocol;

import java.util.concurrent.CompletableFuture;

class TicketProtocolImpl implements TicketProtocol {

    private final ProtocolHandler handler;

    public TicketProtocolImpl(final ProtocolHandler handler) {
        this.handler = handler;
    }

    @Override
    public CompletableFuture<TicketResponse> sendTicketAsync(final TicketRequest request) {
        return handler.execute("ticket-placement", request, TicketResponse.class);
    }

    @Override
    public CompletableFuture<TicketAckResponse> sendTicketAckAsync(final TicketAckRequest request) {
        return handler.execute("ticket-ack", request, TicketAckResponse.class);
    }

    @Override
    public CompletableFuture<CancelResponse> sendCancelAsync(final CancelRequest request) {
        return handler.execute("cancel", request, CancelResponse.class);
    }

    @Override
    public CompletableFuture<CancelAckResponse> sendCancelAckAsync(final CancelAckRequest request) {
        return handler.execute("cancel-ack", request, CancelAckResponse.class);
    }

    @Override
    public CompletableFuture<CashoutResponse> sendCashoutAsync(final CashoutRequest request) {
        return handler.execute("cashout", request, CashoutResponse.class);
    }

    @Override
    public CompletableFuture<CashoutAckResponse> sendCashoutAckAsync(final CashoutAckRequest request) {
        return handler.execute("cashout-ack", request, CashoutAckResponse.class);
    }

    @Override
    public CompletableFuture<ExtSettlementResponse> sendExtSettlementAsync(final ExtSettlementRequest request) {
        return handler.execute("ext-settlement", request, ExtSettlementResponse.class);
    }

    @Override
    public CompletableFuture<ExtSettlementAckResponse> sendExtSettlementAckAsync(final ExtSettlementAckRequest request) {
        return handler.execute("ext-settlement-ack", request, ExtSettlementAckResponse.class);
    }
}
