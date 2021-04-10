package ru.chuvahina.banksystem.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class TransferRequestDTO {
    @JsonProperty("account_id_from")
    private Long accountIdFrom;
    @JsonProperty("account_id_to")
    private Long accountIdTo;
    @JsonProperty("amount")
    private BigDecimal amount;
}
