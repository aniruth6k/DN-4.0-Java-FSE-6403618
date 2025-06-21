package gateway;

public class StripeGateway {
    public void makePayment(double amount) {
        System.out.println("Stripe processing payment of ₹" + amount);
    }
}
