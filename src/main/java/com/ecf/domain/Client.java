package com.ecf.domain;

import com.ecf.registration.models.User;

public class Client extends User {

	private Address shippingAddress;
	private Address billingAddress;

	public Client(){
		this.id=(int)(Math.random());
	}

	public Client(String name,String pass,boolean isAdmin,Address s,Address b) {
		this.password=pass;
		this.name=name;
		this.isAdmin=isAdmin;
		this.id=(int)(Math.random());
		this.billingAddress=b;
		this.shippingAddress=s;
	}

	public Address getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public Address getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}
}
