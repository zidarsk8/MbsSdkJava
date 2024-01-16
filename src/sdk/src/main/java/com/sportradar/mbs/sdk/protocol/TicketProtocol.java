package com.sportradar.mbs.sdk.protocol;

import com.sportradar.mbs.sdk.entities.request.*;
import com.sportradar.mbs.sdk.entities.response.*;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public interface TicketProtocol {

    default TicketResponse sendTicket(TicketRequest request)
            throws ExecutionException, InterruptedException {
        return this.sendTicketAsync(request).get();
    }

    default TicketAckResponse sendTicketAck(TicketAckRequest request)
            throws ExecutionException, InterruptedException {
        return this.sendTicketAckAsync(request).get();
    }

    default CancelResponse sendCancel(CancelRequest request)
            throws ExecutionException, InterruptedException {
        return this.sendCancelAsync(request).get();
    }

    default CancelAckResponse sendCancelAck(CancelAckRequest request)
            throws ExecutionException, InterruptedException {
        return this.sendCancelAckAsync(request).get();
    }

    default CashoutResponse sendCashout(CashoutRequest request)
            throws ExecutionException, InterruptedException {
        return this.sendCashoutAsync(request).get();
    }

    default CashoutAckResponse sendCashoutAck(CashoutAckRequest request)
            throws ExecutionException, InterruptedException {
        return this.sendCashoutAckAsync(request).get();
    }

    default ExtSettlementResponse sendExtSettlement(ExtSettlementRequest request)
            throws ExecutionException, InterruptedException {
        return this.sendExtSettlementAsync(request).get();
    }

    default ExtSettlementAckResponse sendExtSettlementAck(ExtSettlementAckRequest request)
            throws ExecutionException, InterruptedException {
        return this.sendExtSettlementAckAsync(request).get();
    }

    CompletableFuture<TicketResponse> sendTicketAsync(TicketRequest request);

    CompletableFuture<TicketAckResponse> sendTicketAckAsync(TicketAckRequest request);

    CompletableFuture<CancelResponse> sendCancelAsync(CancelRequest request);

    CompletableFuture<CancelAckResponse> sendCancelAckAsync(CancelAckRequest request);

    CompletableFuture<CashoutResponse> sendCashoutAsync(CashoutRequest request);

    CompletableFuture<CashoutAckResponse> sendCashoutAckAsync(CashoutAckRequest request);

    CompletableFuture<ExtSettlementResponse> sendExtSettlementAsync(ExtSettlementRequest request);

    CompletableFuture<ExtSettlementAckResponse> sendExtSettlementAckAsync(ExtSettlementAckRequest request);
}
