package library.model;

import java.time.LocalDate;
import java.util.UUID;

public class Author {

    private final String id = UUID.randomUUID().toString();
    private String name;
    private LocalDate dateOfBirth;

    public Author(String name, LocalDate dateOfBirth){
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

}

