package com.example.projectps.service;

import com.example.projectps.model.Client;

import java.util.List;

public interface ClientService {
    List<Client> getClients();

    public Client addClient(Client client);
    public void deleteByIdClient(int id);
}
