package hu.uni.eszterhazy.swtest;

import hu.uni.eszterhazy.swtest.api.service.BookManagerService;
import hu.uni.eszterhazy.swtest.dao.BookRepository;
import hu.uni.eszterhazy.swtest.service.BookManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public BookManagerService bookManagerService(BookRepository bookRepository){
        return new BookManager(bookRepository);
    }
}
