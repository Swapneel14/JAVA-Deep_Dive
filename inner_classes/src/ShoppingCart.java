public class ShoppingCart {
    private double total;

    public ShoppingCart(double total) {
        this.total = total;
    }

    public void processPayment(Payment pay){
        pay.pay(total);
    }
}
