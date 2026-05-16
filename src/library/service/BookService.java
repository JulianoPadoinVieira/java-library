package library.service;

import library.model.Author;
import library.model.Book;
import library.model.Lend;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BookService {

    private AuthorService authorService;

    public BookService(AuthorService authorService) {
        this.authorService = authorService;
    }

    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> listAll() {
        return books;
    }

        public void printAllBooks() {
        for (Book b : books) {

            Lend lend = new Lend();

            String status = b.isAvailable() ? "Available" :

            System.out.println(
                    "ID: " + b.getId()
                    + " - Title: " + b.getTitle()
                    + " - Available: " + b.isAvailable()
                    + " - Registration Date: " + b.getRegistrationDate());
        }
    }

    public void createBook(String title, String authorName) {

        Author author = authorService.findByName(authorName);

        if (author == null) {
            System.out.println("Author not found.");
            return;
        }

        Book book = new Book(title, author);

        books.add(book);
    }

}
