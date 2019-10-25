package hu.uni.eszterhazy.swtest.service;

import hu.uni.eszterhazy.swtest.api.model.Book;
import hu.uni.eszterhazy.swtest.api.service.BookManagerService;
import hu.uni.eszterhazy.swtest.api.service.exceptions.InvalidISBNException;

import java.util.Collection;

public class BookManager implements BookManagerService {
    @Override
    public void recordBook(Book book) throws InvalidISBNException {

    }

    @Override
    public Collection<Book> listBooks() {
        return null;
    }

    @Override
    public Collection<Book> listBookOfAuthor(String author) {
        return null;
    }
}
