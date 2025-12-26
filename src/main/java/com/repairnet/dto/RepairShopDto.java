package com.repairnet.dto;


import com.repairnet.entity.User;
import org.springframework.stereotype.Component;

@Component
public class RepairShopDto {

    private String name;

    private String address;

    private String phoneNumber;

    private String serviceType;

    private User owner;

    public User getOwner() {
        return owner;
    }

    public RepairShopDto setOwner(User owner) {
        this.owner = owner;
        return this;
    }

    public String getName() {
        return name;
    }

    public RepairShopDto setName(String name) {
        this.name = name;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public RepairShopDto setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public RepairShopDto setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String getServiceType() {
        return serviceType;
    }

    public RepairShopDto setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
}
