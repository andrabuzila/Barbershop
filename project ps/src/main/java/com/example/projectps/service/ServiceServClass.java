package com.example.projectps.service;

import com.example.projectps.model.Service;
import com.example.projectps.repository.ServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
public class ServiceServClass implements ServiceService{
    @Autowired
    ServiceInterface serviceI;

    @Override
    public List<Service> getServices() {
        return (List<Service>) serviceI.findAll();
    }

    @Override
    public Optional<Service> getByIdServices(int id) {
        return serviceI.findById(id);
    }
}
