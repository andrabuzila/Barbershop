package com.example.projectps.repository;

import com.example.projectps.model.Barber;
import org.springframework.data.repository.CrudRepository;

public interface BarberInterface extends CrudRepository<Barber, Integer> {

}