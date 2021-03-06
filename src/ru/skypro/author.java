package ru.skypro;

public class author {
    public String authorFirstName;
    public String authorSecondName;

    public author(String authorFirstName, String authorSecondName) {
        this.authorFirstName = authorFirstName;
        this.authorSecondName = authorSecondName;
    }

    public String getAuthorName() {return authorFirstName + authorSecondName;}

    public String getAuthorFirstName() {return authorFirstName;}

    public String getAuthorSecondName() {return  authorSecondName;}


    /// ДЗ Методы обьектов

    @Override
    public String toString() {
        return "Author{" +
                "name='" + authorFirstName + '\'' +
                ", subname='" + authorSecondName + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        author author = (author) o;
        return authorFirstName.equals(author.authorFirstName) && authorSecondName.equals(authorSecondName);

    }
    @Override
    public int hashCode() {return Object.hash(authorFirstName, authorSecondName);

    }
}