package com.whiterockstudio.contracts.services;

import com.whiterockstudio.contracts.models.Contract;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.concurrent.CompletableFuture;

@Service
public class ContractService {

    public CompletableFuture<List<Contract>> getAllContract() {
        Contract contract = Contract.builder()
                                    .id("contract-1")
                                    .mensualFees(BigDecimal.TEN)
                                    .build();
        return CompletableFuture.completedFuture(List.of(contract));
    }

}
