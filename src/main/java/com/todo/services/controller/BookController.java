package com.todo.services.controller;

import java.util.ArrayList;

import com.todo.services.model.BookModel;
import com.todo.services.model.ResponseModel;

public class BookController {    
    ResponseModel response = new ResponseModel();
    public ArrayList<BookModel> books = new ArrayList<BookModel>();

    public ResponseModel getAllBooks() {
        response.message = "Books get successfully";
        response.error = 0;
        response.data = books;

        return response;
    }

    public ResponseModel addBook(BookModel book) {
        if (book.getTitle().isEmpty() || book.getAuthor().isEmpty() || book.getDescription().isEmpty()) {
            response.message = "Please fill all the fields";
            response.error = 1;
            response.data = null;
        } else {
            books.add(book);
            response.message = "Book added successfully";
            response.error = 0;
            response.data = book;
        }

        return response;
    }
}
