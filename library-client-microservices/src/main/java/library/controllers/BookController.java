package library.controllers;

import library.client.resttemplate.BookServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/books")
public class BookController {

    private BookServiceClient bookServiceClient;
    @Autowired
    public BookController(BookServiceClient bookServiceClient) {
        this.bookServiceClient = bookServiceClient;
    }

    @GetMapping
    public String booksList(Model model) {
        model.addAttribute("books", bookServiceClient.getAllBooks());
        return "books";
    }

    @GetMapping("/{id}")
    public String bookDetailPage(@PathVariable("id") String id, Model model) {
        model.addAttribute("books", bookServiceClient.getBookById(id));
        return "bookDetail";
    }
}
