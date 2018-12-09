package library.microservices.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import library.microservices.Book;

import java.util.Optional;

@RestController
@RequestMapping(path="/books", produces="application/json")
@CrossOrigin(origins="*")
public class LibraryController {

    private BookRepository bookRepository;

    @Autowired
    private LibraryController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping
    public Iterable<Book> allBooks() {
        return bookRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Book> findById(@PathVariable String id) {
        return bookRepository.findById(Long.valueOf(id));
    }
}
