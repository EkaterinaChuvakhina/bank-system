package ru.chuvahina.banksystem.controller;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.chuvahina.banksystem.dto.AccountRequestDTO;
import ru.chuvahina.banksystem.dto.AccountResponseDTO;
import ru.chuvahina.banksystem.mapper.AccountMapper;
import ru.chuvahina.banksystem.service.AccountService;

@RestController
public class AccountController {
    private final AccountMapper accountMapper = Mappers.getMapper(AccountMapper.class);
    private final AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/accounts/{accountId}")
    public AccountResponseDTO getById(@PathVariable Long accountId) {
        return accountMapper.toResponseDTO(accountService.findById(accountId));
    }

    @PostMapping("/accounts")
    public Long create(@RequestBody AccountRequestDTO accountRequestDTO) {
        return accountService.save(accountMapper.toAccount(accountRequestDTO));
    }
}
