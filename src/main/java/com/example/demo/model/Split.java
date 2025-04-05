package com.example.demo.model;

import lombok.Data;

import java.util.Map;

@Data
public class Split {
    private String splitType;
    private Map<Long, Double> split;
}
