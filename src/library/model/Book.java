package library.model;

import java.time.LocalDate;
import java.util.UUID;

public class Book {

    private final String id = UUID.randomUUID().toString();
    private String title;
    private Author author;
    private boolean available;
    private LocalDate registrationDate;

    public Book(String title, Author author ){

        this.title = title;
        this.author = author;
        this.available = true;
        this.registrationDate = LocalDate.now();
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public String getStatus() {
        if (available) {
            return "Available";
        }

        return "Borrowed for" + get
    }

}
