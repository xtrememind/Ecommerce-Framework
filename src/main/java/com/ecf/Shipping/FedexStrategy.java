package com.ecf.Shipping;


public class FedexStrategy implements IShippingStrategy {

    private double shippingRate = 5;
    private double orderTotal;

    public FedexStrategy(double orderTotal){
        this.orderTotal = orderTotal;
    }

    @Override
    public double calculate() {
        return orderTotal * shippingRate / 100;
    }
}
