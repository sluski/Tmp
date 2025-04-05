package com.example.demo;

import com.example.demo.model.Bill;
import com.example.demo.model.Debt;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Map;


@Service
@RequiredArgsConstructor
public class BillingService {

    private final ExchangeService exchangeService;
    private final DebtRepository debtRepository;

    public void addBill(Bill bill) {
        BigDecimal exchangeRate = BigDecimal.ONE;

        if (!bill.getCurrency().equals("PLN")) {
            double rate = exchangeService.getExchangeRate(bill.getCurrency(), "PLN");
            exchangeRate = BigDecimal.valueOf(rate);
        }

        for (Map.Entry<Long, Double> entry : bill.getSplit().entrySet()) {
            BigDecimal amount = BigDecimal.valueOf(entry.getValue());
            BigDecimal amountInMainCurrency = amount.multiply(exchangeRate).setScale(2, RoundingMode.HALF_UP);

            debtRepository.save(new Debt(
                    entry.getKey(),
                    bill.getPaidByUserId(),
                    amountInMainCurrency
            ));
        }
    }

}
