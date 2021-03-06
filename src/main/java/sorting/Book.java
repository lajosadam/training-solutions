package sorting;

import java.util.Objects;

public class Book {

    private int regNumber;

    private String title;

    private String author;

    public Book(int regNumber, String title, String author) {
        this.regNumber = regNumber;
        this.title = title;
        this.author = author;
    }

    public int getRegNumber() {
        return regNumber;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return regNumber == book.regNumber && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regNumber, title, author);
    }

    @Override
    public String toString() {
        return "Book{" +
                "regNumber=" + regNumber +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
