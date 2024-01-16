package com.sportradar.mbs.sdk.internal.protocol;

import com.sportradar.mbs.sdk.entities.request.*;
import com.sportradar.mbs.sdk.entities.response.*;
import com.sportradar.mbs.sdk.protocol.TicketProtocol;

import java.util.concurrent.CompletableFuture;

class TicketProtocolImpl implements TicketProtocol {

    private final ProtocolEngine engine;

    public TicketProtocolImpl(final ProtocolEngine engine) {
        this.engine = engine;
    }

    @Override
    public CompletableFuture<TicketResponse> sendTicketAsync(final TicketRequest request) {
        return engine.execute("ticket-placement", request, TicketResponse.class);
    }

    @Override
    public CompletableFuture<TicketAckResponse> sendTicketAckAsync(final TicketAckRequest request) {
        return engine.execute("ticket-ack", request, TicketAckResponse.class);
    }

    @Override
    public CompletableFuture<CancelResponse> sendCancelAsync(final CancelRequest request) {
        return engine.execute("cancel", request, CancelResponse.class);
    }

    @Override
    public CompletableFuture<CancelAckResponse> sendCancelAckAsync(final CancelAckRequest request) {
        return engine.execute("cancel-ack", request, CancelAckResponse.class);
    }

    @Override
    public CompletableFuture<CashoutResponse> sendCashoutAsync(final CashoutRequest request) {
        return engine.execute("cashout", request, CashoutResponse.class);
    }

    @Override
    public CompletableFuture<CashoutAckResponse> sendCashoutAckAsync(final CashoutAckRequest request) {
        return engine.execute("cashout-ack", request, CashoutAckResponse.class);
    }

    @Override
    public CompletableFuture<ExtSettlementResponse> sendExtSettlementAsync(final ExtSettlementRequest request) {
        return engine.execute("ext-settlement", request, ExtSettlementResponse.class);
    }

    @Override
    public CompletableFuture<ExtSettlementAckResponse> sendExtSettlementAckAsync(final ExtSettlementAckRequest request) {
        return engine.execute("ext-settlement-ack", request, ExtSettlementAckResponse.class);
    }
}
