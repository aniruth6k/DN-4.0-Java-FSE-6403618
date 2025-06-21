package service;

import model.Product;
import java.util.HashMap;

public class InventoryManager {
    private HashMap<String, Product> inventory = new HashMap<>();

    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
    }

    public void updateProduct(String id, String name, int qty, double price) {
        if (inventory.containsKey(id)) {
            Product p = inventory.get(id);
            p.setProductName(name);
            p.setQuantity(qty);
            p.setPrice(price);
        }
    }

    public void deleteProduct(String id) {
        inventory.remove(id);
    }

    public void printInventory() {
        for (Product p : inventory.values()) {
            System.out.println(p);
        }
    }
}
