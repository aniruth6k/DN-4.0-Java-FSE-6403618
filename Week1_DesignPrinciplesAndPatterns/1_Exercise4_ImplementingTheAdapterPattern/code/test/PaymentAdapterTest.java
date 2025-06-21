package test;

import adapter.*;
import gateway.*;
import processor.PaymentProcessor;

public class PaymentAdapterTest {
    public static void main(String[] args) {
        PaymentProcessor paypalProcessor = new PayPalAdapter(new PayPalGateway());
        PaymentProcessor stripeProcessor = new StripeAdapter(new StripeGateway());

        paypalProcessor.processPayment(1500);
        stripeProcessor.processPayment(2500);
    }
}
