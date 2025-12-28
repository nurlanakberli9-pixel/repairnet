package com.repairnet.dto;

import com.repairnet.entity.Brand;
import com.repairnet.entity.ServiceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import org.springframework.stereotype.Component;

@Component
public class ServiceOfferDto {
    private Brand brand;


    private ServiceType serviceType;

    private Double price;

    public Brand getBrand() {
        return brand;
    }

    public ServiceOfferDto setBrand(Brand brand) {
        this.brand = brand;
        return this;
    }

    public ServiceType getServiceType() {
        return serviceType;
    }

    public ServiceOfferDto setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    public Double getPrice() {
        return price;
    }

    public ServiceOfferDto setPrice(Double price) {
        this.price = price;
        return this;
    }
}
