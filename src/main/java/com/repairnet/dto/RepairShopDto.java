package com.repairnet.dto;


import com.repairnet.entity.ServiceOffer;
import com.repairnet.entity.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RepairShopDto {

    private String name;

    private String address;

    private String phoneNumber;

    private List<ServiceOfferDto> offers=new ArrayList<>();

    public List<ServiceOfferDto> getOffers() {
        return offers;
    }

    public RepairShopDto setOffers(List<ServiceOfferDto> offers) {
        this.offers = offers;
        return this;
    }

//    private User owner;
//
//    public User getOwner() {
//        return owner;
//    }
//
//    public RepairShopDto setOwner(User owner) {
//        this.owner = owner;
//        return this;
//    }

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


}
