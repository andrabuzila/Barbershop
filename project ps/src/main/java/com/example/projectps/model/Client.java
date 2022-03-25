package com.example.projectps.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int idclient;
    private String name;
    private String phonenumber;
    private int idbarber;
    private int idservice;

    public int getIdClient() {
       return idclient;
    }

    public void setIdClient(int idClient) {
        this.idclient = idClient;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name;
    }

    public String getPhoneNumber() {
        return phonenumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        phonenumber = phoneNumber;
    }

    public int getIdBarber() {
        return idbarber;
    }

    public void setIdBarber(int idBarber) {
        this.idbarber = idBarber;
    }

    public int getIdService() {
        return idservice;
    }

    public void setIdService(int idService) {
        this.idservice = idService;
    }

}

