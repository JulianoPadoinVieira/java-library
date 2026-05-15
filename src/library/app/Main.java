package library.app;

import library.service.*;
import library.model.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        ClientService clientService = new ClientService();

        clientService.addClient(new Client("Juliano Vieira", "proprietyfkurd@hotmail.com"));
        clientService.addClient(new Client("Karine Velasco", "kah@gmail.com"));
        clientService.addClient(new Client("Gerusclecio", "gerus@hotmailcom"));
        clientService.addClient(new Client("Adams Silva", "silva147@hotmailcom"));

        System.out.println("-------------- Clients --------------");
        clientService.printAllClients();
        System.out.println("----------- End of Clients -----------");
        System.out.println(" ");

        AuthorService authorService = new AuthorService();

        authorService.addAuthor(new Author("Sigmund Freud", LocalDate.parse("1856-05-06")));
        authorService.addAuthor(new Author("Idalberto Chiavenato", LocalDate.parse("1936-12-22")));
        authorService.addAuthor(new Author("Steve Jobs", LocalDate.parse("1955-02-24")));
        authorService.addAuthor(new Author("Robert T. Kiyosaki", LocalDate.parse("1947-04-08")));

        System.out.println("-------------- Authors --------------");
        authorService.printAllAuthors();
        System.out.println("----------- End of Authors -----------");
        System.out.println(" ");



    }


}
