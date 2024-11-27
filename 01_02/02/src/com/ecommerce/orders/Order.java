package com.ecommerce.orders;

import com.ecommerce.Customer;
import com.ecommerce.Product;
import java.util.List;

public class Order {
    private String orderID;
    private Customer customer;
    private List<Product> products;
    private double orderTotal;

    public Order(String orderID, Customer customer, List<Product> products) {
        this.orderID = orderID;
        this.customer = customer;
        this.products = products;
        this.orderTotal = products.stream().mapToDouble(Product::getPrice).sum();
    }

    public String getOrderID() {
        return orderID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public double getOrderTotal() {
        return orderTotal;
    }

    public void updateOrderStatus() {
        // Logic to update order status
    }

    public void generateOrderSummary() {
        // Logic to generate order summary
        System.out.println("Order Summary:");
        System.out.println("Order ID: " + orderID);
        System.out.println("Customer: " + customer.getName());
        System.out.println("Products: " + products);
        System.out.println("Total: $" + orderTotal);
    }

    @Override
    public String toString() {
        return "Order [orderID=" + orderID + ", customer=" + customer + ", products=" + products + ", orderTotal=" + orderTotal + "]";
    }
}