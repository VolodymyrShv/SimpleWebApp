package my.study.SimpleWebApp.repositories;

import my.study.SimpleWebApp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
