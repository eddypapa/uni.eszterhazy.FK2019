package hu.uni.eszterhazy.swtest.service;

import hu.uni.eszterhazy.swtest.api.model.Book;
import hu.uni.eszterhazy.swtest.api.service.BookManagerService;
import hu.uni.eszterhazy.swtest.api.service.exceptions.InvalidISBNException;
import hu.uni.eszterhazy.swtest.dao.BookRepository;

import java.util.ArrayList;
import java.util.Collection;

public class BookManager implements BookManagerService {

    private BookRepository bookRepository;

    public BookManager(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void recordBook(Book book) throws InvalidISBNException {
        bookRepository.save(book);
    }

    @Override
    public Collection<Book> listBooks() {
        Collection<Book> result = new ArrayList<>()
        return null;
    }

    @Override
    public Collection<Book> listBookOfAuthor(String author) {
        return null;
    }
}
