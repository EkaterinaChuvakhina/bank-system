package ru.chuvahina.banksystem.mapper;

import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import ru.chuvahina.banksystem.dto.AccountRequestDTO;
import ru.chuvahina.banksystem.dto.AccountResponseDTO;
import ru.chuvahina.banksystem.entity.Account;

@Mapper(collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
        uses = BillMapper.class)
public interface AccountMapper {
    AccountResponseDTO toResponseDTO(Account account);

    Account toAccount(AccountRequestDTO accountRequestDTO);
}
