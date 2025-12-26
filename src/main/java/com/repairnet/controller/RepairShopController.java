package com.repairnet.controller;

import com.repairnet.dto.RepairShopDto;
import com.repairnet.entity.RepairShop;
import com.repairnet.service.RepairShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/RepairShop")
public class RepairShopController {

    @Autowired
    private RepairShopService repairShopService;

    @PostMapping("createRepairShop")
    public void createRepairShop(@RequestBody RepairShopDto repairShopDto) {
        repairShopService.creatRepairShop(repairShopDto);
    }


}
