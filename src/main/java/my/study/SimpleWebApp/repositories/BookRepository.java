package my.study.SimpleWebApp.repositories;

import my.study.SimpleWebApp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
