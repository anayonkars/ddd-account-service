package com.ddd_bootcamp.domain;

import java.util.UUID;

//Account Aggregate
public class Account {

    private final CustomerId customerId;
    private UUID accountId;
    private Address address;

    public Account(Address address, CustomerId customerId) {
        this.accountId = UUID.randomUUID();
        this.address = address;
        this.customerId = customerId;
    }

    public void updateAddress(Address address) {
        this.address = address;
    }

    public UUID getAccountId() {
        return accountId;
    }

    public Address getAddress() {
        return address;
    }

    public CustomerId getCustomerId() {
        return customerId;
    }

    @Override
    public String toString() {
        return "Account{" +
                "customerId=" + customerId +
                ", accountId=" + accountId +
                ", address=" + address +
                '}';
    }
}
