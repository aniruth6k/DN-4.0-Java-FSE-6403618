package test;

import model.Product;
import service.InventoryManager;

public class InventoryTest {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        manager.addProduct(new Product("P001", "Mouse", 100, 499.99));
        manager.addProduct(new Product("P002", "Keyboard", 80, 999.99));
        manager.updateProduct("P002", "Mechanical Keyboard", 60, 1199.99);
        manager.deleteProduct("P001");

        manager.printInventory();
    }
}
