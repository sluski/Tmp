package com.example.demo;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class BillingServiceTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private BillingService billingService;

    /*
        Przypadki testowe:
        - poprawny podział
        - sumaryczna wartość podziału jest mniejsza niż pełna kwota rachunku
        - sumaryczna wartość podziału jest większa niż pełna kwota rachunku
        - podziału przyjmuje wartości ujemne
        - brak dodatkowych osób do podziału
        - błędna waluta
     */



}
