package library.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.UUID;

public class Lend {

    private final String id = UUID.randomUUID().toString();
    private Book book;
    private Client client;
    private LocalDate lendDate;
    private LocalDate devolutionDate;


    public Lend(Book book, String clientName) {
        this.book = book;
        this.clientName = clientName;
        this.lendDate = LocalDate.now();
    }

    public String getId() {
        return id;
    }

    

}
