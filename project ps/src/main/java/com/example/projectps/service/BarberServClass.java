package com.example.projectps.service;

import com.example.projectps.model.Barber;
import com.example.projectps.repository.BarberInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BarberServClass implements BarberService{
    @Autowired
    BarberInterface barberI;

    @Override
    public List<Barber> getBarbers() {
        return (List<Barber>) barberI.findAll();
    }

    @Override
    public Barber addBarber(Barber barber) {
        return barberI.save(barber);
    }

    @Override
    public void deleteByIdBarber(int idbarber) {
        barberI.deleteById(idbarber);
    }
}
