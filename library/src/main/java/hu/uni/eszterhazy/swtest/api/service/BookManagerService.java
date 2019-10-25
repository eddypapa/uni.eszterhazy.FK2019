package hu.uni.eszterhazy.swtest.api.service;

import hu.uni.eszterhazy.swtest.api.model.Book;
import hu.uni.eszterhazy.swtest.api.service.exceptions.InvalidISBNException;

import java.util.Collection;

public interface BookManagerService {

    /**
     * Store book in DB.
     * If the ISBN mnumber is invalid, already exists.
     * @param book
     *
     * @Exception InvalidISBNException
     */
    void recordBook (Book book) throws InvalidISBNException;

    /**
     * List all books.
     * @return
     */
    Collection<Book> listBooks();

    /**
     * List books where the author is contained in the author list of the books.
     * Match is case sensitive.
     *
     * @param author
     * @return
     */
    Collection<Book> listBokkOfAuthor(String author);

}
