package com.example.borrame.entidad;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class BorrameUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public BorrameUser() {
    }

    public BorrameUser(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
