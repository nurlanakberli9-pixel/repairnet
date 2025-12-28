package com.repairnet.repo;

import com.repairnet.entity.RepairShop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;


@Repository
public interface RepairShopRepo extends JpaRepository<RepairShop,Long>, JpaSpecificationExecutor<RepairShop> {






}
