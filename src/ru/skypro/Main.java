package ru.skypro;

public class Main {

    public static void main(String[] args) {
        author firstAuthor = new author("Имя", "Фамилия");
        System.out.println("Автор книги " + firstAuthor.getAuthorFirstName() + firstAuthor.getAuthorSecondName());
        Book firstBook = new Book("Книга с названием", firstAuthor, 1950);
        System.out.println("Год издания был = " + firstBook.getPublishingYear());
        firstBook.getPublishingYear();
        System.out.println("Год издания стал =" + firstBook.getPublishingYear());
        System.out.println(firstBook.getBookName() + " " + firstBook.getAuthorName().getAuthorName() + " " + firstBook.getPublishingYear());

        author firstAuthor_1 = new author("Имя", "Фамилия");
        System.out.println("Автор книги " + firstAuthor.getAuthorFirstName() + firstAuthor.getAuthorSecondName());
        Book firstBook_1 = new Book("Книга с названием", firstAuthor, 1950);
        System.out.println("Год издания был = " + firstBook.getPublishingYear());
        firstBook_1.getPublishingYear();
        System.out.println("Год издания стал =" + firstBook.getPublishingYear());
        System.out.println(firstBook.getBookName() + " " + firstBook.getAuthorName().getAuthorName() + " " + firstBook.getPublishingYear());

        System.out.println(firstAuthor.toString());
        System.out.println(firstBook.toString());

        System.out.println("Одинаковый автор? " + firstAuthor.equals(firstAuthor_1));
        System.out.println("Одинаковая книга? " + firstBook.equals(firstBook_1));

        firstBook.setPublishingYear(1955);

        System.out.println(firstBook.hashCode());
        System.out.println(firstBook_1.hashCode());
    }
}
