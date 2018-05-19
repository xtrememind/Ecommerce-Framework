package com.ecf.Shipping;


public class UpsStrategy implements IShippingStrategy {

    private double shippingRate = 7;
    private double orderTotal;

    public UpsStrategy(double orderTotal){
        this.orderTotal = orderTotal;
    }

    @Override
    public double calculate() {
        return orderTotal * shippingRate / 100;
    }
}
