package com.repairnet.service;

import com.repairnet.dto.RepairShopDto;
import com.repairnet.entity.RepairShop;
import com.repairnet.entity.User;
import com.repairnet.mapper.RepairShopMapper;
import com.repairnet.repo.RepairShopRepo;
import com.repairnet.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RepairShopService {

    @Autowired
    private RepairShopRepo repairShopRepo;

    @Autowired
    private RepairShopMapper repairShopMapper;

    public void creatRepairShop(RepairShopDto repairShopDto) {
       RepairShop repairShop= repairShopMapper.toEntity(repairShopDto);
      repairShop.setOwner(repairShopDto.getOwner());
        repairShopRepo.save(repairShop);
    }
}
