public class BillingSystem {
    double ammount;
    String customertype;

    public BillingSystem(double ammount, String customertype) {
        this.ammount = ammount;
        this.customertype = customertype;
    }

    public void generateBill(){
        System.out.println("Original Bill is :- Rs."+ammount);
        class Discount{
            public  double getDiscount(){
                double discount = 0;
                if(customertype.equalsIgnoreCase("VIP"))discount=40;
                else if(customertype.equalsIgnoreCase("Regular"))discount=20;
                else if(customertype.equalsIgnoreCase("Normal"))discount=5;


                return(ammount)-(ammount)*(discount/100);
            }
        }

        Discount d1 = new Discount();
       double disc=d1.getDiscount();



        System.out.println("Final Bill is:- Rs"+disc);
    }


}

