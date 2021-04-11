package ru.chuvahina.banksystem.utill;

import ru.chuvahina.banksystem.entity.Account;
import ru.chuvahina.banksystem.entity.Bill;
import ru.chuvahina.banksystem.exception.NotDefaultBillException;

public final class AccountUtils {
    private AccountUtils(){}
    public static Bill findDefaultBill(Account accountFrom) {
        return accountFrom.getBills().stream()
                .filter(Bill::getIsDefault)
                .findAny()
                .orElseThrow(() -> new NotDefaultBillException("Unable to find default bill for account with id: "
                        + accountFrom.getAccountId()));
    }
}
