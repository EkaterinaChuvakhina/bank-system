package ru.chuvahina.banksystem.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
public class BillResponseDTO {
    private Long billId;
    private BigDecimal amount;
    private Boolean isDefault;
}
