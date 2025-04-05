package com.example.demo;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class BillingServiceTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private BillingService billingService;

    @Test
    public void beforeAll() {
//        Mockito.when()
    }



}
