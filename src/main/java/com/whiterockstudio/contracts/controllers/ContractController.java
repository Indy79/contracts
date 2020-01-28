package com.whiterockstudio.contracts.controllers;

import com.whiterockstudio.contracts.models.Contract;
import com.whiterockstudio.contracts.services.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping(value = "/api/v1/contracts")
public class ContractController {

    private ContractService contractService;

    @Autowired
    public ContractController (ContractService contractService) {
        this.contractService = contractService;
    }

    @GetMapping
    @ResponseBody
    public CompletableFuture<List<Contract>> getAllContracts() {
        return contractService.getAllContract();
    }

}
