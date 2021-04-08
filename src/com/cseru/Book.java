package com.cseru;

public class Book {
    private String title;
    private String author;
    private boolean isBorrowed;

    public Book() {
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    public Book(String title, String author, boolean isBorrowed) {
        this.title = title;
        this.author = author;
        this.isBorrowed = isBorrowed;
    }

    public void borrowBook(){
        isBorrowed = true;
    }
    public void returnBook(){
        isBorrowed = false;
    }
    public boolean isBookBorrowed(){
        return isBorrowed;
    }
}
