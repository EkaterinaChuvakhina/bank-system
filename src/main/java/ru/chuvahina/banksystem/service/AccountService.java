package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.chuvahina.banksystem.entity.Account;
import ru.chuvahina.banksystem.entity.Bill;
import ru.chuvahina.banksystem.repository.AccountRepository;

import java.util.List;

@Service
public class AccountService {
    private final AccountRepository accountRepository;

    @Autowired
    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public Long save(String name, String email, List<Bill> bills) {
        Account account = Account.builder().name(name)
                .email(email).bills(bills).build();
        return accountRepository.save(account).getAccountId();
    }

    public Account findById


}
