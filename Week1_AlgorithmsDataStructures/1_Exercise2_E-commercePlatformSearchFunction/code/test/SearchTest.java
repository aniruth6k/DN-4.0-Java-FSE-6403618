package test;

import model.Product;
import service.*;

public class SearchTest {
    public static void main(String[] args) {
        Product[] products = {
                new Product("P101", "Laptop", "Electronics"),
                new Product("P102", "Shoes", "Fashion"),
                new Product("P103", "Watch", "Accessories"),
                new Product("P104", "Tablet", "Electronics")
        };

        Product result1 = LinearSearchService.search(products, "Watch");
        Product result2 = BinarySearchService.search(products, "Watch");

        System.out.println("Linear Search Result: " + result1);
        System.out.println("Binary Search Result: " + result2);
    }
}
