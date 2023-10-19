package com.todo.services.controller;

import java.util.ArrayList;

import com.todo.services.model.BookModel;
import com.todo.services.model.ResponseModel;

public class BookController {    
    ResponseModel response = new ResponseModel();
    ResponseController responseController = new ResponseController();

    public ArrayList<BookModel> books = new ArrayList<BookModel>();

    public ResponseModel getAllBooks() {
        return responseController.setResponse("Book get successfully", 0, books);
    }

    public ResponseModel addBook(BookModel book) {
        System.out.println("book: " + books);
        books.add(book);

        return responseController.setResponse("Book added successfully", 0, book);
    }
}
