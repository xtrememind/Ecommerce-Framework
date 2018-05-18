package com.ecf.Patterns.Payment;

public class PayInfo {
    private long id;
    private long amount;
    private long userId;
    private long creditNo;
    private Address address;
    private paymentType payType;
    private ShippingInfo ShippingInfo;

    public com.ecf.Patterns.Payment.ShippingInfo getShippingInfo() {
        return ShippingInfo;
    }

    public void setShippingInfo(com.ecf.Patterns.Payment.ShippingInfo shippingInfo) {
        ShippingInfo = shippingInfo;
    }

    public paymentType getPayType() {
        return payType;
    }

    public void setPayType(paymentType payType) {
        this.payType = payType;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getCreditNo() {
        return creditNo;
    }

    public void setCreditNo(long creditNo) {
        this.creditNo = creditNo;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
