package com.library.controller;

import com.library.service.BookService;

public class BookController {
    private BookService bookService;

    public void setBookService(BookService bookService) {
        this.bookService = bookService;
    }

    public void displayBook() {
        System.out.println("Controller: " + bookService.fetchBook());
    }
}
