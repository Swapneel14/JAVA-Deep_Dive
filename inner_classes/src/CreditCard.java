public class CreditCard implements Payment{
    @Override
    public void pay(double ammount) {
        System.out.println(ammount+" Paid Successfully");
    }
}
