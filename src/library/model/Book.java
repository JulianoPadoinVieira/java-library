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

    public static Book createMockBook(
            String title,
            Author author
    ) {

        Book book = new Book(title, author);

        book.registrationDate = generateRandomDate();

        return book;
    }

    private static LocalDate generateRandomDate() {

        LocalDate startDate = LocalDate.of(1984, 1, 1);

        LocalDate endDate = LocalDate.now().minusDays(1);

        long start = startDate.toEpochDay();

        long end = endDate.toEpochDay();

        long randomDay = start
                + (long) (Math.random() * (end - start));

        return LocalDate.ofEpochDay(randomDay);
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



}
