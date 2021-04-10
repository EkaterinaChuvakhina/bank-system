package ru.chuvahina.banksystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.chuvahina.banksystem.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
