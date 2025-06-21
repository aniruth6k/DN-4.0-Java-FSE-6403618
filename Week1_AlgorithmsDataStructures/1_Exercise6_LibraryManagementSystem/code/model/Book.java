package model;

public class Book implements Comparable<Book> {
    private String bookId;
    private String title;
    private String author;

    public Book(String bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public int compareTo(Book other) {
        return this.title.compareToIgnoreCase(other.title);
    }

    public String toString() {
        return bookId + " | " + title + " | " + author;
    }
}
