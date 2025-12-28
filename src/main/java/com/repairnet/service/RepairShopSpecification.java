package com.repairnet.service;

import com.repairnet.entity.RepairShop;
import com.repairnet.entity.ServiceOffer;
import jakarta.persistence.criteria.Join;
import org.springframework.data.jpa.domain.Specification;

public class RepairShopSpecification {

    public static Specification<RepairShop> hasBrand(String brandName) {
        return (root, query, cb) -> {
            if (brandName == null) return null;
            // RepairShop -> ServiceOffer -> Brand zənciri ilə JOIN edirik
            Join<RepairShop, ServiceOffer> offers = root.join("offers");
            return cb.equal(offers.get("brand").get("name"), brandName);
        };
    }

    public static Specification<RepairShop> hasServiceType(String serviceName) {
        return (root, query, cb) -> {
            if (serviceName == null) return null;
            Join<RepairShop, ServiceOffer> offers = root.join("offers");
            return cb.equal(offers.get("serviceType").get("name"), serviceName);
        };
    }

    public static Specification<RepairShop> hasPriceLessThan(Double maxPrice) {
        return (root, query, cb) -> {
            if (maxPrice == null) return null;
            Join<RepairShop, ServiceOffer> offers = root.join("offers");
            return cb.lessThanOrEqualTo(offers.get("price"), maxPrice);
        };
    }
}