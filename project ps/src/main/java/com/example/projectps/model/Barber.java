package com.example.projectps.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Barber{

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int idbarber;
    private String name;
    private String phonenumber;
    private String services;
    private String image;

    public int getIdbarber() {
        return idbarber;
    }

    public void setIdbarber(int idbarber) {
        this.idbarber = idbarber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getServices() {
        return services;
    }

    public void setServices(String services) {
        this.services = services;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
