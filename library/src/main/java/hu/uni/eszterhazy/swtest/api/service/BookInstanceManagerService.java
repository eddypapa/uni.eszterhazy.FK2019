package hu.uni.eszterhazy.swtest.api.service;

import hu.uni.eszterhazy.swtest.api.model.Book;
import hu.uni.eszterhazy.swtest.api.model.BookInstance;
import hu.uni.eszterhazy.swtest.api.model.Lending;
import hu.uni.eszterhazy.swtest.api.service.exceptions.InventoryNoAlreadyExistsException;

import java.util.Collection;

public interface BookInstanceManagerService {

    /**
     *
     * @param book
     * @param inventoryNo
     * @throws InventoryNoAlreadyExistsException
     */
    void recordBookInstance (Book book, Long inventoryNo) throws InventoryNoAlreadyExistsException;

    /**
     *
     * @param book
     * @return
     */
    Collection<BookInstance>  listInstanceOfBook(Book book);

    /**
     *
     * @param inventoryNo
     * @return
     */
    BookInstance findBookInstance(Long inventoryNo);

    /**
     *
     * @param bookInstance
     * @return
     */
    Collection<Lending> lendingHistory(BookInstance bookInstance);

}
