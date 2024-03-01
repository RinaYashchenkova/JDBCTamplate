package org.example.models;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Book {
    private int id;
    @NotEmpty(message = "Название книги не может быть пустым.")
    @Size(min = 3,max = 255, message = "Название книги дожлно в себе содержать от 3 до 255 символов.")
    private String title;
    @NotEmpty(message = "Автор книги не может быть пустым.")
    @Size(min = 3,max = 255,message = "Поле автора должно в себе содержать от 3 до 255 символов.")
    private  String author;
    @Min(value = 1700, message = "Год публикации должен быть больше 1700")
    private int year;

    public Book(){

    }

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
