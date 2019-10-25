package hu.uni.eszterhazy.swtest.api.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Collection;

@Entity
public class Book {

    @Id
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

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthors(Collection<String> authors) {
        this.authors = authors;
    }

    public Book() {
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
