package com.repairnet.controller;

import com.repairnet.entity.Brand;
import com.repairnet.entity.ServiceType;
import com.repairnet.repo.BrandRepo;
import com.repairnet.repo.ServiceTypeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/serviceData")
public class CommonServiceDataController {


    @Autowired
    private BrandRepo brandRepo;
    @Autowired
    private ServiceTypeRepo serviceTypeRepo;


    @GetMapping("/brand")
    public List<Brand> getAllBrands() {
        return brandRepo.findAll();
    }


    @GetMapping("/serviceType")
    public List<ServiceType> getAllServiceTypes() {
        return serviceTypeRepo.findAll();
    }

}
