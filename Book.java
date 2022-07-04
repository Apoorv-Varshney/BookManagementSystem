package com.company;

public class Book {

    private String bookId;
    private String bookName;
    private String author;
    private String summary;

    public String getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    public String getSummary() {
        return summary;
    }

    public Book(String bookId, String bookName, String author, String summary){
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.summary = summary;
    }

    @Override
    public String toString() {
        return this.getBookName()+", "+this.getSummary()+", "+this.getBookId()+", "+this.getAuthor();
    }
}
