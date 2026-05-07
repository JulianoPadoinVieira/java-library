package library.service;

import library.model.Client;

import java.util.ArrayList;
import java.util.List;


public class ClientService {

    private List<Client> clients = new ArrayList<>();

    public void addClient(Client client) {
        clients.add(client);
    }

    public List<Client> listAll() {
        return clients;
    }

    public void printAllClients() {
        for (Client c : clients) {
            System.out.println(c.getId() + " - " + c.getName() + " - " + c.getEmail());
        }
    }

}
