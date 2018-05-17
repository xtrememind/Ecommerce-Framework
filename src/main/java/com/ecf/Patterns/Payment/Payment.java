package com.ecf.Patterns.Payment;

public abstract class Payment {

    PayInfo payinfo;

    public void SetPaymentInfo(PayInfo info)
    {
        payinfo = info;
    }

    public abstract long CalcShippingFee();

    public abstract long CalcTaxes();

    public final boolean ProcessPayment() {
        // payment process goes here
        long shippingfee = CalcShippingFee();
        long tax = CalcTaxes();

        if (payinfo.getPayType() == paymentType.creditCard) {
            // process credit card
            return true;
        } else if (payinfo.getPayType() == paymentType.PayPal) {
            // process paypal
            return true;
        }
        else
        {
            // process another types
            return true;
        }
    }
}
