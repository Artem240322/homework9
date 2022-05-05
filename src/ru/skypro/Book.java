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

    @Override
    public String toString() {
        return "Book{" +
                "name'" + bookName + '\'' +
                ", author=" + authorName +
                ", publicationYear=" + publishingYear +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishingYear == book.publishingYear && bookName.equals(book.bookName) && authorName.equals(book.authorName);

    }
    @Override
    public int hashCod() {return Object.hash(bookName, authorName, publishingYear); }
}
