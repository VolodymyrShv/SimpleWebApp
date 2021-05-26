package my.study.SimpleWebApp.repositories;

import my.study.SimpleWebApp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
