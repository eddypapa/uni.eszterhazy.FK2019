package hu.uni.eszterhazy.swtest.service;

import hu.uni.eszterhazy.swtest.api.model.Book;
import hu.uni.eszterhazy.swtest.api.service.BookManagerService;
import hu.uni.eszterhazy.swtest.dao.BookRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

@RunWith(SpringRunner.class)
@DataJpaTest
public class BookManagerTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private BookRepository bookRepository;

    @Test
    public void testRecordSingleBook(){
        BookManagerService bookManagerService = new BookManager(bookRepository);
        Book book = new Book(
                "123123",
                "Title",
                Arrays.asList("Jhon Doe")
        );

        System.out.println(bookManagerService.listBooks());
    }
}
