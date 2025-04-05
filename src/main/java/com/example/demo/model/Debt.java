package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class Debt {
    private long userId;
    private long oweToUserId;
    private BigDecimal value;
}
