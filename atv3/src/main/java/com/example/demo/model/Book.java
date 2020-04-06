package com.example.demo.model;

/**
 * Book
 */
public class Book {
    private int id;
    private String title;
    private String author;
    private String year;
    private String publisher;

    public Book(String title, String author, String year, String publisher) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.publisher = publisher;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "\t> ID: "   +id+
        "+ \n\t> Título: "  +title+
        "+ \n\t> Autor: "   +author+
        "+ \n\t> Ano: "     +year+
        "+ \n\t> Por: "     +publisher;
                
    }
}