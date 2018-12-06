package library.microservices.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import library.microservices.entities.Book;

@CrossOrigin(origins="*")
public interface BookRepository extends CrudRepository<Book, String> {

}