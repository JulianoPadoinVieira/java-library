package library.service;

import library.model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookService {

    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> listAll() {
        return books;
    }

    public void printAllBooks() {
        for (Book b : books) {
            System.out.println(b.getId() + " - " + c.getName() + " - " + c.getEmail());
        }
    }
}
