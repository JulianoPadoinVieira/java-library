package library.app;

import library.service.*;
import library.model.*;

public class Main {

    public static void main(String[] args) {

        ClientService service = new ClientService();

        service.addClient(new Client("Juliano Vieira", "proprietyfkurd@hotmail.com"));
        service.addClient(new Client("Karine Velasco", "kah@gmail.com"));
        service.addClient(new Client("Gerusclecio", "gerus@hotmailcom"));
        service.addClient(new Client("Adams Silva", "silva147@hotmailcom"));

        System.out.println("-------------- Clients --------------");
        service.printAllClients();
        System.out.println("----------- End of Clients -----------");



    }


}
