package com.ddd_bootcamp.threetier.controller.viewModel;

public class AccountRequest {

    private AddressRequest addressRequest;

    private String CustomerId;

    public AccountRequest() {
    }

    public AddressRequest getAddressRequest() {
        return addressRequest;
    }

    public void setAddressRequest(AddressRequest addressRequest) {
        this.addressRequest = addressRequest;
    }

    public String getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(String customerId) {
        CustomerId = customerId;
    }

    @Override
    public String toString() {
        return "AccountRequest{" +
                "addressRequest=" + addressRequest +
                ", CustomerId='" + CustomerId + '\'' +
                '}';
    }
}
