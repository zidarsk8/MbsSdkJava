package com.sportradar.mbs.sdk.protocol;

import com.sportradar.mbs.sdk.entities.request.*;
import com.sportradar.mbs.sdk.entities.response.*;

import java.util.concurrent.CompletableFuture;

public interface TicketProtocol {

    CompletableFuture<TicketResponse> sendTicketAsync(TicketRequest request);

    CompletableFuture<TicketAckResponse> sendTicketAckAsync(TicketAckRequest request);

    CompletableFuture<CancelResponse> sendCancelAsync(CancelRequest request);

    CompletableFuture<CancelAckResponse> sendCancelAckAsync(CancelAckRequest request);

    CompletableFuture<CashoutResponse> sendCashoutAsync(CashoutRequest request);

    CompletableFuture<CashoutAckResponse> sendCashoutAckAsync(CashoutAckRequest request);

    CompletableFuture<ExtSettlementResponse> sendExtSettlementAsync(ExtSettlementRequest request);

    CompletableFuture<ExtSettlementAckResponse> sendExtSettlementAckAsync(ExtSettlementAckRequest request);
}
