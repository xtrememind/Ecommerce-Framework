package com.ecf.Payment.Strategy;

public class CreditCardStrategy implements IPaymentStrategy {

    private String name;
    private String cardNumber;
    private int cvv;
    private String dateOfExpiry;

    public CreditCardStrategy(String clientName, String ccNumber, int cvv, String expiryDate){
        this.name=clientName;
        this.cardNumber=ccNumber;
        this.cvv=cvv;
        this.dateOfExpiry=expiryDate;
    }
    @Override
    public void pay(double amount) {
        System.out.println(amount +" paid with credit/debit card");
    }

}
