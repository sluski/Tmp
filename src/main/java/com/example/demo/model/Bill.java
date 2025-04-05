package com.example.demo.model;

import lombok.Data;

@Data
public class Bill {
    private long paidByUserId;
    private double value; // todo: BigDecimal?
    private String currency;
    private Split split;
}
