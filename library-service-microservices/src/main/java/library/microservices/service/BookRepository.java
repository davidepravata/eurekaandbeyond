package library.microservices.service;

import entities.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins="*")
public interface BookRepository extends CrudRepository<Book, String> {

}