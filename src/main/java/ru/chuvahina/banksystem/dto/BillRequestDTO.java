package ru.chuvahina.banksystem.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
public class BillRequestDTO {
    private BigDecimal amount;
    private Boolean isDefault;
}
