class Product {
    //    Assignment 6
    private int productId;
    private String name;
    private double price;
    private int stock;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        }
    }
}

class User2 {
    int userId;
    String username;
    String email;
}

class Customer2 extends User2 {
    public void placeOrder() {
        System.out.println("Order placed.");
    }
}

class Admin2 extends User2 {
    public void updateProduct() {
        System.out.println("Product updated.");
    }
}