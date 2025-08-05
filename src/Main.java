public class Main {
    public static void main(String[] args) {
//        Assignment 5
        User u1 = new Customer();
        System.out.println(u1.getUserDetails());

        User u2 = new Admin();
        System.out.println(u2.getUserDetails());

        u1.placeOrder(10);
        u1.placeOrder(20, 3);

        Payment p1 = new CreditCardPayment();
        p1.validateCard();
        p1.processPayment();

        Payment p2 = new PayPalPayment();
        p2.validateCard();
        p2.processPayment();


//        Assignment 6
        Product p = new Product();
        p.setProductId(1);
        p.setName("Laptop");
        p.setPrice(500.0);
        p.setStock(10);

        Customer c = new Customer2();
        c.placeOrder();

        Admin a = new Admin2();
        a.updateProduct();
    }
}
