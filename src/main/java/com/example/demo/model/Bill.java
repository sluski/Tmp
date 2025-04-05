package com.example.demo.model;

import lombok.Data;

import java.util.Map;

@Data
public class Bill {
    private long paidByUserId;
    private double value;
    private String currency;
    private Map<Long, Double> split; // userId : value
}
