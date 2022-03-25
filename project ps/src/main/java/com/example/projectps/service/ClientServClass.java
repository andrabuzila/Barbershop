package com.example.projectps.service;

import com.example.projectps.model.Client;
import com.example.projectps.repository.ClientInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class ClientServClass implements ClientService{
    @Autowired
    ClientInterface clientI;
    @Override
    public List<Client> getClients() {
        return (List<Client>) clientI.findAll();
    }

    @Override
    public Client addClient(Client cl) {
        return clientI.save(cl);
    }

    @Override
    public void deleteByIdClient(int idclient) {
        clientI.deleteById(idclient);
    }

}
