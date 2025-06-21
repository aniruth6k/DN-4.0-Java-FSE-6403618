package test;

import model.Order;
import service.*;

public class SortTest {
    public static void main(String[] args) {
        Order[] orders1 = {
                new Order("O001", "Alice", 4000),
                new Order("O002", "Bob", 2500),
                new Order("O003", "Charlie", 7000)
        };

        Order[] orders2 = orders1.clone();

        BubbleSortService.sort(orders1);
        System.out.println("Bubble Sort:");
        for (Order o : orders1) System.out.println(o);

        QuickSortService.sort(orders2, 0, orders2.length - 1);
        System.out.println("\nQuick Sort:");
        for (Order o : orders2) System.out.println(o);
    }
}
