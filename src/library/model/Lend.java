package library.model;

import java.time.LocalDate;
import java.util.UUID;

public class Lend {

    private final String id = UUID.randomUUID().toString();
    private Book book;
    private String clientName;
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
