package com.repairnet.service;

import com.repairnet.dto.RepairShopDto;
import com.repairnet.entity.*;
import com.repairnet.enumm.UserRole;
import com.repairnet.mapper.RepairShopMapper;
import com.repairnet.repo.RepairShopRepo;
import com.repairnet.repo.UserRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RepairShopService {

    @Autowired
    private RepairShopRepo repairShopRepo;

    @Autowired
    private RepairShopMapper repairShopMapper;

    @Autowired
    private UserRepo userRepo;

    @Transactional
    public void creatRepairShop(RepairShop repairShop) {

        repairShop.setOwner(repairShop.getOwner());
     Optional<User> user= userRepo.findById(repairShop.getOwner().getId());
        user.get().setRole(UserRole.OWNER);
       repairShopRepo.save(repairShop);

      List<ServiceOffer> offers= repairShop.getOffers();
      for(ServiceOffer offer:offers){
          offer.setRepairShop(repairShop);
      }
    }




    public Page<RepairShopDto> searchShops(String brand, String service, Double maxPrice, Pageable pageable) {
    Specification<RepairShop> spec = Specification
            .where(RepairShopSpecification.hasBrand(brand))
            .and(RepairShopSpecification.hasServiceType(service))
            .and(RepairShopSpecification.hasPriceLessThan(maxPrice));

    return repairShopRepo.findAll(spec, pageable).map(repairShopMapper::toDto);
}
}
