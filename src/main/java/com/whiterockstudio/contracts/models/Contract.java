package com.whiterockstudio.contracts.models;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class Contract {

    private String id;
    private BigDecimal mensualFees;

}
