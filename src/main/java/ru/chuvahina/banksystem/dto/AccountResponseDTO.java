package ru.chuvahina.banksystem.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class AccountResponseDTO {
    private Long accountId;
    private String name;
    private String email;
    private List<BillResponseDTO> bills;
}
