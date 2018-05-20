package com.ecf.Payment;

import com.ecf.domain.Address;

import java.util.Date;

public class PaymentInfo {
    private long id;
    private long amount;
    private long userId;
    private String userName;
    private String creditNo;
    private String expiryDate;
    private int ccv;
    private double orderAmount;

    private String email;
    private String password;
    private Address address;
    private paymentType payType;
    private ShippingInfo ShippingInfo;

    public PaymentInfo(String userName, String creditNo, String expiryDate, int ccv) {
        this.userName = userName;
        this.creditNo = creditNo;
        this.expiryDate = expiryDate;
        this.ccv = ccv;
        this.payType = paymentType.creditCard;
    }

    public PaymentInfo(String email, String password) {
        this.email = email;
        this.password = password;
        this.payType = paymentType.PayPal;
    }

    public double getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(double orderAmount) {
        this.orderAmount = orderAmount;
    }

    public com.ecf.Payment.ShippingInfo getShippingInfo() {
        return ShippingInfo;
    }

    public void setShippingInfo(com.ecf.Payment.ShippingInfo shippingInfo) {
        ShippingInfo = shippingInfo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getCcv() {
        return ccv;
    }

    public void setCcv(int ccv) {
        this.ccv = ccv;
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

    public String getCreditNo() {
        return creditNo;
    }

    public void setCreditNo(String creditNo) {
        this.creditNo = creditNo;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
