package library.service;

import library.model.Author;
import library.model.Client;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class AuthorService {

    private List<Author> authors = new ArrayList<>();

    public void addAuthor(Author author) {authors.add(author);}

    public List<Author> listAll() { return authors; }

    public void printAllAuthors() {
        for (Author a : authors) {
            LocalDate date = LocalDate.parse(String.valueOf(a.getDateOfBirth()));
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            String formattedDate = date.format(formatter);
            System.out.println(a.getId() + " - " + a.getName() + " - " + formattedDate);
        }
    }

    public Author findByName(String name) {

        for (Author af : authors) {
            if (af.getName().equalsIgnoreCase(name)) {
                return af;
            }
        }

        return null;
    }

}
