package com.example.projectps.service;

import com.example.projectps.model.Service;

import java.util.List;
import java.util.Optional;

public interface ServiceService {

    List<Service> getServices();
    Optional<Service> getByIdServices(int id);
}
