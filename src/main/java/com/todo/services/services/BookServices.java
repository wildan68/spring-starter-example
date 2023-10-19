package com.todo.services.services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.todo.services.controller.BookController;
import com.todo.services.model.BookModel;
import com.todo.services.model.ResponseModel;
import com.todo.services.controller.ResponseController;

import exceptions.CustomParameterConstraintException;

@RestController
public class BookServices {
    BookController bookController = new BookController();
    ResponseController responseController = new ResponseController();

    @GetMapping("/book")
    public ResponseModel getAllBooks() {
        return bookController.getAllBooks();
    }

    @PostMapping("/book")
    public ResponseModel addBook(@RequestBody BookModel book) {
        try {
            if (book.getTitle() == null || book.getDescription() == null || book.getAuthor() == null) {
                throw new CustomParameterConstraintException("Title, description, and author are required");
            }

            return bookController.addBook(book);
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
