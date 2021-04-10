package ru.chuvahina.banksystem.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.chuvahina.banksystem.entity.Account;
import ru.chuvahina.banksystem.entity.Bill;
import ru.chuvahina.banksystem.exception.NowDefaultBillException;

import java.math.BigDecimal;

@RequiredArgsConstructor
@Service
public class TransferService {
    private final AccountService accountService;

    public Object transfer(Long accountIdFrom, Long accountIdTo, BigDecimal amount) {
        Account accountFrom = accountService.findById(accountIdFrom);
        Account accountTo = accountService.findById(accountIdTo);
        Bill billFrom = findDefaultBill(accountFrom);
        Bill billTo = findDefaultBill(accountTo);
        billFrom.setAmount(billFrom.getAmount().subtract(amount));
        billFrom.setAmount(billTo.getAmount().add(amount));
        accountService.update(accountFrom);
        accountService.update(accountTo);
        return "OK";

    }
    
    }
}
