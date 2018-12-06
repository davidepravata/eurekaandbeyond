package library.microservices;

import javax.persistence.Entity;

@Entity
public class Book {

    private long id;
    private String title;
    private String cost;
    private String isbn;


    public Book(long id, String title, String cost, String isbn) {
        this.id = id;
        this.title = title;
        this.cost = cost;
        this.isbn = isbn;
    }

    public Book() { }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", cost=" + cost +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
