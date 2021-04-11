package ru.chuvahina.banksystem.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.chuvahina.banksystem.entity.Account;
import ru.chuvahina.banksystem.entity.Bill;
import ru.chuvahina.banksystem.utill.AccountUtils;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class PaymentService {
    private final AccountService accountService;

    public Object pay(Long accountId, BigDecimal paymentAmount) {
        Account account = accountService.findById(accountId);
        Bill defaultBill = AccountUtils.findDefaultBill(account);
        defaultBill.setAmount(defaultBill.getAmount().subtract(paymentAmount));
        accountService.update(account);
        return "OK";
    }
}
