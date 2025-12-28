package com.repairnet.entity;

import jakarta.persistence.*;

@Entity
public class ServiceOffer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long aLong;

    @ManyToOne
    @JoinColumn(name = "shop_id")
    private RepairShop repairShop;

    @ManyToOne
    @JoinColumn(name = "brand_id")
    private Brand brand;

    @ManyToOne
    @JoinColumn(name = "service_type_id")
    private ServiceType serviceType;

    private Double price;


    public Long getaLong() {
        return aLong;
    }

    public ServiceOffer setaLong(Long aLong) {
        this.aLong = aLong;
        return this;
    }

    public RepairShop getRepairShop() {
        return repairShop;
    }

    public ServiceOffer setRepairShop(RepairShop repairShop) {
        this.repairShop = repairShop;
        return this;
    }

    public Brand getBrand() {
        return brand;
    }

    public ServiceOffer setBrand(Brand brand) {
        this.brand = brand;
        return this;
    }

    public ServiceType getServiceType() {
        return serviceType;
    }

    public ServiceOffer setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    public Double getPrice() {
        return price;
    }

    public ServiceOffer setPrice(Double price) {
        this.price = price;
        return this;
    }
}
