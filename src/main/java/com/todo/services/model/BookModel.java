package com.todo.services.model;
import lombok.Getter;
import lombok.Setter;

public class BookModel {
    @Getter
    @Setter
    private String title;

    @Getter
    @Setter
    private String author;

    @Getter
    @Setter
    private String description;
}
