package com.example.projectps.service;

import com.example.projectps.model.Barber;

import java.util.List;

public interface BarberService {

    List<Barber> getBarbers();

    public Barber addBarber(Barber barber);
    public void deleteByIdBarber(int idbarber);
}
