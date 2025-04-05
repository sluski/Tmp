package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Debt {
    private long userId;
    private long oweToUserId;
    private double value;
}
