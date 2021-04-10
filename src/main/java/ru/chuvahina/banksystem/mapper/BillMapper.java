package ru.chuvahina.banksystem.mapper;

import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import ru.chuvahina.banksystem.dto.BillRequestDTO;
import ru.chuvahina.banksystem.dto.BillResponseDTO;
import ru.chuvahina.banksystem.entity.Bill;

import java.util.List;

@Mapper(collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface BillMapper {
    BillResponseDTO billToBillResponseDTO(Bill bill);

    Bill toBill(BillRequestDTO billRequestDTO);

    List<BillResponseDTO> mapBillResponse(List<Bill> bills);

    List<BillRequestDTO> mapBillRequest(List<Bill> bills);

}
