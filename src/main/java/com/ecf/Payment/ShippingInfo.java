package com.ecf.Payment;

import com.ecf.domain.Address;

public class ShippingInfo {
    private Address address;
    private long fees;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public long getFees() {
        return fees;
    }

    public void setFees(long fees) {
        this.fees = fees;
    }
}
