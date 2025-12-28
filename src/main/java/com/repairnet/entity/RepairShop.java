package com.repairnet.entity;

import jakarta.persistence.*;


import java.util.ArrayList;
import java.util.List;

@Entity
public class RepairShop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private String address;

    private String phoneNumber;


    @OneToMany(mappedBy = "repairShop", cascade = CascadeType.ALL)
    private List<ServiceOffer> offers=new ArrayList<ServiceOffer>();

    public List<ServiceOffer> getOffers() {
        return offers;
    }

    public RepairShop setOffers(List<ServiceOffer> offers) {
        this.offers = offers;
        return this;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "owner_id", nullable = false)
    private User owner;


    public Long getId() {
        return id;
    }

    public RepairShop setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public RepairShop setName(String name) {
        this.name = name;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public RepairShop setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public RepairShop setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }


    public User getOwner() {
        return owner;
    }

    public RepairShop setOwner(User owner) {
        this.owner = owner;
        return this;
    }
}
