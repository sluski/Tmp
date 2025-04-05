package com.example.demo.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Map;

@Data
public class Bill {
    private long paidByUserId;
    private BigDecimal value;
    private String currency;
    private Map<Long, Double> split; // userId : value
}
