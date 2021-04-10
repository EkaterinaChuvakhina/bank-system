package ru.chuvahina.banksystem.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.chuvahina.banksystem.dto.TransferRequestDTO;
import ru.chuvahina.banksystem.service.TransferService;

@RestController
@RequiredArgsConstructor
public class TransferController {
    private final TransferService transferService;

    @PostMapping("/transfers")
    public Object transfer(@RequestBody TransferRequestDTO transferRequestDTO) {
        return transferService.transfer(transferRequestDTO.getAccountIdFrom(), transferRequestDTO.getAccountIdTo(),
                transferRequestDTO.getAmount());
    }
}
