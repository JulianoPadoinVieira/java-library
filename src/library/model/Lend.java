package library.model;

import java.time.LocalDate;

public class Lend {

    private Long id;
    private Book book;
    private String clientName;
    private LocalDate lendDate;
    private LocalDate devolutionDate;


    public Lend(Book book, String clientName) {
        this.book = book;
        this.clientName = clientName;
        this.lendDate = LocalDate.now();
    }

}
