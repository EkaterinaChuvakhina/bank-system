package ru.chuvahina.banksystem.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class AccountRequestDTO {
    private String name;
    private String email;
    private List<BillRequestDTO> bills;
}
