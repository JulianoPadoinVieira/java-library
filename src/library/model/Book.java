package library.model;

import java.time.LocalDate;

public class Book {

    private Long id;
    private String title;
    private Author author;
    private boolean available;
    private LocalDate registrationDate;
    private LocalDate updateDate;

    public Book(String title, Author author){

        this.title = title;
        this.author = author;

    }

    public boolean isAvailable(){
        return available;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public LocalDate getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDate updateDate) {
        this.updateDate = updateDate;
    }

}
