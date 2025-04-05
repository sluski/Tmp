package com.example.demo;

import com.example.demo.model.Bill;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class BillingService {

    private final UserRepository userRepository;
    private final ExchangeService exchangeService;

    public void addBill(Bill bill) {
        bill.getSplit().getSplit().forEach((k, v) -> {

            // todo: save to database
        });

    }

}
