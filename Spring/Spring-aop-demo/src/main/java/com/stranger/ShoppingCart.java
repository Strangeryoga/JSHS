package com.stranger;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {

    public void checkout(String status) {
        System.out.println("Checkout method from shopping cart is called");
    }

    public int quantity() {
        return 2;
    }
}
