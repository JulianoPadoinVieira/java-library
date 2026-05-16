package library.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.UUID;
import library.model.Client;
import library.model.Book;

public class Lend {

    private final String id = UUID.randomUUID().toString();

    private Book book;
    private Client client;

    private LocalDate lendDate;
    private LocalDate devolutionDate;

    public Lend(Book book, Client client) {

        this.book = book;
        this.client = client;

        this.lendDate = LocalDate.now();

        book.setAvailable(false);
    }

    public long getBorrowedDays() {
        return ChronoUnit.DAYS.between(
                lendDate,
                LocalDate.now()
        );
    }

    public String getStatus() {

        return "Borrowed for "
                + getBorrowedDays()
                + " days";
    }

    public Book getBook() {
        return book;
    }

    public Client getClient() {
        return client;
    }

    public LocalDate getLendDate() {
        return lendDate;
    }

    public String getId() {
        return id;
    }

}
