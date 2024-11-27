import com.ecommerce.Product;
import com.ecommerce.Customer;
import com.ecommerce.orders.Order;

public class Main {
    public static void main(String[] args) {
        // Create products
        Product product1 = new Product("P001", "Laptop", 999.99);
        Product product2 = new Product("P002", "Smartphone", 499.99);
        Product product3 = new Product("P003", "Headphones", 79.99);

        // Create customer
        Customer customer = new Customer("C001", "John Doe");

        // Add products to shopping cart
        customer.addProductToCart(product1);
        customer.addProductToCart(product2);
        customer.addProductToCart(product3);

        // Display shopping cart
        System.out.println("Shopping Cart:");
        customer.getShoppingCart().forEach(System.out::println);

        // Place order
        customer.placeOrder();

        // Create order
        Order order = new Order("O001", customer, customer.getShoppingCart());

        // Generate order summary
        order.generateOrderSummary();
    }
}