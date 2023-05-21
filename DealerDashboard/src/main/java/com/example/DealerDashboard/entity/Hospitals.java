package com.example.DealerDashboard.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="hospitals")
public class Hospitals {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String address;
    private int total_orders;

    public Hospitals() {
    }

    public Hospitals(int id, String name, String address, int total_orders) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.total_orders = total_orders;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getTotal_orders() {
        return total_orders;
    }

    public void setTotal_orders(int total_orders) {
        this.total_orders = total_orders;
    }
}