package service;

import model.Book;
import java.util.Arrays;

public class BinaryBookSearch {
    public static Book search(Book[] books, String title) {
        Arrays.sort(books);
        int left = 0, right = books.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int cmp = books[mid].getTitle().compareToIgnoreCase(title);
            if (cmp == 0) return books[mid];
            else if (cmp < 0) left = mid + 1;
            else right = mid - 1;
        }
        return null;
    }
}
