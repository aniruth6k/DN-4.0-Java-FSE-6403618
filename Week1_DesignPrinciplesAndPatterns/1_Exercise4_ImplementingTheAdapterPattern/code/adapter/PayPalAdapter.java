package adapter;

import gateway.PayPalGateway;
import processor.PaymentProcessor;

public class PayPalAdapter implements PaymentProcessor {
    private final PayPalGateway payPal;

    public PayPalAdapter(PayPalGateway payPal) {
        this.payPal = payPal;
    }

    public void processPayment(double amount) {
        payPal.sendPayment(amount);
    }
}
