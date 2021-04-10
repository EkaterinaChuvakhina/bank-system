package ru.chuvahina.banksystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.chuvahina.banksystem.entity.Account;
import ru.chuvahina.banksystem.exceptions.AccountNotFoundException;
import ru.chuvahina.banksystem.repository.AccountRepository;

@Service
public class AccountService {
    private final AccountRepository accountRepository;

    @Autowired
    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public Long save(Account account) {
        return accountRepository.save(account).getAccountId();
    }

    public Account findById(Long accountId) {
        return accountRepository.findById(accountId)
                .orElseThrow(() -> new AccountNotFoundException("Account with id: " + accountId + "not found"));
    }

    public Account update(Account account) {
        return accountRepository.save(account);
    }


}
