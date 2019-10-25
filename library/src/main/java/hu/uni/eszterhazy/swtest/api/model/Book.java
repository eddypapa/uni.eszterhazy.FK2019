package hu.uni.eszterhazy.swtest.api.model;

import java.util.Collection;

public class Book {

    private String title;
    private Collection<String> authors;

    public Book(String title, Collection<String> authors) {
        this.title = title;
        this.authors = authors;
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
                "title='" + title + '\'' +
                ", authors=" + authors +
                '}';
    }
}
