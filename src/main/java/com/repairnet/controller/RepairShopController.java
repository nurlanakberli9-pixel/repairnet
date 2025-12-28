package com.repairnet.controller;

import com.repairnet.dto.RepairShopDto;
import com.repairnet.entity.RepairShop;
import com.repairnet.service.RepairShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/RepairShop")
public class RepairShopController {

    @Autowired
    private RepairShopService repairShopService;

    @PostMapping("createRepairShop")
    public void createRepairShop(@RequestBody RepairShop repairShop) {
        repairShopService.creatRepairShop(repairShop);
    }


    @GetMapping("/search")
    public ResponseEntity<Page<RepairShopDto>> filterShops(
            @RequestParam(required = false) String brand,
            @RequestParam(required = false) String service,
            @RequestParam(required = false) Double maxPrice,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size
    ) {
        Pageable pageable = PageRequest.of(page, size);
        return ResponseEntity.ok(repairShopService.searchShops(brand, service, maxPrice, pageable));
    }


}
