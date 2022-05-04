package ru.skypro;

public class Main {

    public static void main(String[] args) {
	author firstAuthor = new author("Имя", "Фамилия");
    System.out.println("Автор книги " + firstAuthor.getAuthorFirstName() + firstAuthor.getAuthorSecondName());
    Book firstBook = new Book("Книга с названием", firstAuthor,1950);
    System.out.println("Год издания был = " + firstBook.getPublishingYear());
    firstBook.getPublishingYear(2022);
    System.out.println("Год издания стал =" + firstBook.getPublishingYear());
    System.out.println(firstBook.getBookName() + " " + firstBook.getNameaAuthor().getAuthorFirstName() + " " + firstBook.getPublishingYear());

    }
}
