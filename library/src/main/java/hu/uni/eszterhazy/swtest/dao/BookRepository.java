package hu.uni.eszterhazy.swtest.dao;

import hu.uni.eszterhazy.swtest.api.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, String> {

}
