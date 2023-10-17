package com.todo.services.model;

public class BookModel {
    private String title;
    private String author;
    private String description;

    public void setTitle (String title) {
        this.title = title;
    }

    public String getTitle () {
        return this.title;
    }

    public void setAuthor (String author) {
        this.author = author;
    }

    public String getAuthor () {
        return this.author;
    }

    public void setDescription (String description) {
        this.description = description;
    }

    public String getDescription () {
        return this.description;
    }
}
