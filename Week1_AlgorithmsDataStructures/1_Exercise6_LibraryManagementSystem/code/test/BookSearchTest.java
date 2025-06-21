package test;

import model.Book;
import service.*;

public class BookSearchTest {
    public static void main(String[] args) {
        Book[] books = {
                new Book("B001", "Java Basics", "James Gosling"),
                new Book("B002", "Data Structures", "Mark Allen"),
                new Book("B003", "Algorithms", "Robert Sedgewick")
        };

        Book result1 = LinearBookSearch.search(books, "Algorithms");
        Book result2 = BinaryBookSearch.search(books, "Algorithms");

        System.out.println("Linear Search Result: " + result1);
        System.out.println("Binary Search Result: " + result2);
    }
}
