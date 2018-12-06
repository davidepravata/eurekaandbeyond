package library.client.resttemplate;

import entities.Book;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Service
public class BookServiceClient {

    private RestTemplate rest;

    public BookServiceClient(@LoadBalanced RestTemplate rest) {
        this.rest = rest;
    }

    public Book getBookById(String bookId) {
        return rest.getForObject("http://library-service/book/{id}", Book.class, bookId);
    }

    public Iterable<Book> getAllBooks() {
        Book[] books = rest.getForObject("http://library-service/ingredients", Book[].class);
        return Arrays.asList(books);
    }
}
