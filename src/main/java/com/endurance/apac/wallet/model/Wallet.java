package com.endurance.apac.wallet.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Wallet {
    private UUID uuid;
    private String customerID;
    private String resellerID;
    private Integer balance;

    public Wallet(@JsonProperty("customerID") String customerID,
                  @JsonProperty("resellerID") String resellerID) {
        this.uuid = UUID.randomUUID();
        this.customerID = customerID;
        this.resellerID = resellerID;
        this.balance = 0;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getResellerID() {
        return resellerID;
    }

    public void setResellerID(String resellerID) {
        this.resellerID = resellerID;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }
}
