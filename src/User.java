class User {
//    Assignment 5
    public String getUserDetails() {
        return "User details";
    }

    public void placeOrder(int productId) {
        System.out.println("Order placed for product ID: " + productId);
    }

    public void placeOrder(int productId, int quantity) {
        System.out.println("Order placed for product ID: " + productId + " with quantity: " + quantity);
    }
}

class Customer extends User {
    public String getUserDetails() {
        return "Customer details";
    }
}

class Admin extends User {
    public String getUserDetails() {
        return "Admin details";
    }
}

// Abstraction Part

interface Payment {
    void processPayment();
    void validateCard();
}

class CreditCardPayment implements Payment {
    public void processPayment() {
        System.out.println("Processing credit card payment");
    }

    public void validateCard() {
        System.out.println("Validating credit card");
    }
}

class PayPalPayment implements Payment {
    public void processPayment() {
        System.out.println("Processing PayPal payment");
    }

    public void validateCard() {
        System.out.println("Validating PayPal account");
    }
}
