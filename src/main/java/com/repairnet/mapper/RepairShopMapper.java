package com.repairnet.mapper;

import com.repairnet.dto.RepairShopDto;
import com.repairnet.entity.RepairShop;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring" )
public interface RepairShopMapper {
    RepairShop toEntity(RepairShopDto repairShopDto);
    RepairShopDto toDto(RepairShop repairShop);
}
