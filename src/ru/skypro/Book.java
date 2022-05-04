package ru.skypro;

public class Book {
    private final String bookName;
    public author authorName;
    private int publishingYear;

    public Book(String bookName, author authorName, int publishingYear) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.publishingYear = publishingYear;
    }

    public String getBookName() {return bookName;}
    public author getAuthorName() {
        return authorName;}
    public int getPublishingYear(){
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear){
        this.publishingYear = publishingYear;
    }
}
