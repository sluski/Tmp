package com.example.demo;

import com.example.demo.model.Bill;
import com.example.demo.model.Debt;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service
@RequiredArgsConstructor
public class BillingService {

    private final ExchangeService exchangeService;
    private final DebtRepository debtRepository;

    public void addBill(Bill bill) {
        double exchangeRate = 1;
        if(!bill.getCurrency().equals("PLN")) { // domyślnie tu jest enum
            exchangeRate = exchangeService.getExchangeRate(bill.getCurrency(), "PLN");
        }

        for(Map.Entry<Long, Double> entry : bill.getSplit().entrySet()) {
            double amountInMainCurrency = entry.getValue() * exchangeRate;
            debtRepository.save(new Debt(entry.getKey(), bill.getPaidByUserId(), amountInMainCurrency)); // zapis należności do bazy
        }
    }

}
