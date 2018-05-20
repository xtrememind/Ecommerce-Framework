package com.ecf.Payment;

import com.ecf.Payment.Strategy.CreditCardStrategy;
import com.ecf.Payment.Strategy.IPaymentStrategy;
import com.ecf.Payment.Strategy.PaypalStrategy;

public abstract class Payment {

    PaymentInfo payinfo;

    public void SetPaymentInfo(PaymentInfo info)
    {
        payinfo = info;
    }

    public abstract long CalcShippingFee();

    public abstract long CalcTaxes();

    public final boolean processPayment() {
        long shippingFee = CalcShippingFee();
        long tax = CalcTaxes();

        if (payinfo.getPayType() == paymentType.creditCard) {
            IPaymentStrategy cc = new CreditCardStrategy(payinfo.getUserName(), payinfo.getCreditNo(), payinfo.getCcv(),payinfo.getExpiryDate());
            cc.pay(shippingFee + tax + payinfo.getAmount());
            return true;
        } else if (payinfo.getPayType() == paymentType.PayPal) {
            IPaymentStrategy payPal = new PaypalStrategy(payinfo.getEmail(), payinfo.getPassword());
            payPal.pay(shippingFee + tax + payinfo.getAmount());
            return true;
        }
        else
        {
            return false;
        }
    }
}

