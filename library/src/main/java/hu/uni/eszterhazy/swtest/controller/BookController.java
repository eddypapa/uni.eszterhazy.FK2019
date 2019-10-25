package hu.uni.eszterhazy.swtest.controller;

import hu.uni.eszterhazy.swtest.api.model.Book;
import hu.uni.eszterhazy.swtest.api.service.BookManagerService;
import hu.uni.eszterhazy.swtest.api.service.exceptions.InvalidISBNException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping(value = "book")
public class BookController {

    private Logger logger = LoggerFactory.getLogger(BookController.class);
    private BookManagerService bookManagerService;

    public BookController(BookManagerService bookManagerService) {
        this.bookManagerService = bookManagerService;
    }

    @RequestMapping(value = "/record", method = RequestMethod.POST)
    public void addBook (@RequestBody Book book){
        logger.info(book.toString());
        try {
            bookManagerService.recordBook(book);
        }catch (InvalidISBNException e) {
            e.printStackTrace();;
        }
    }

    @RequestMapping(value = {"/", ""})
    public Collection<Book> listBooks(){
        return bookManagerService.listBooks();
    }
}



