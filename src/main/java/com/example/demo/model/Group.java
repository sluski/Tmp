package com.example.demo.model;

import lombok.Data;

import java.util.List;

@Data
public class Group {

    private long id;
    private List<User> members;
}
