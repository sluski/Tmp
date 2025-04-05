package com.example.demo;

import com.example.demo.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRepository {

    public User findByEmail(String email) {
        throw new RuntimeException("Not implemented");
    }

    public User findByPhone(String phone) {
        throw new RuntimeException("Not implemented");
    }

    public List<User> findGroupById(long groupId) {
        throw new RuntimeException("Not implemented");
    }

    public User findById(long userId) {
        throw new RuntimeException("Not implemented");
    }
}
