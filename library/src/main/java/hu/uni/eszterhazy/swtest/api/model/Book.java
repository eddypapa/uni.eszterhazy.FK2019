package hu.uni.eszterhazy.swtest.api.model;

import java.util.Collection;

public class Book {

    private String isbn;
    private String title;
    private Collection<String> authors;

    public Book(String title, Collection<String> authors) {
        this.isbn = isbn;
        this.title = title;
        this.authors = authors;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public Collection<String> getAuthors() {
        return authors;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", authors=" + authors +
                '}';
    }
}
