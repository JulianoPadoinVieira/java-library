package library.service;

import library.model.Author;

import java.util.ArrayList;
import java.util.List;

public class AuthorService {

    private List<Author> authors = new ArrayList<>();

    public void addAuthor(Author autor) {authors.add(author);}

    public List<Author> listAll() { return authors; }

    public void printAllAuthors() {
        for (Author a : authors) {
            System.out.println(a.getId + );
        }
    }

}
