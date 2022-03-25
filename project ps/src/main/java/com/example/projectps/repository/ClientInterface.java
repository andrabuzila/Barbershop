package com.example.projectps.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.projectps.model.Client;

public interface ClientInterface extends CrudRepository<Client, Integer> {

}
