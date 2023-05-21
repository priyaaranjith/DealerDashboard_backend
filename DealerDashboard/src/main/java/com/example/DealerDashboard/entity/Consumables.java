package com.example.DealerDashboard.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "consumables")
public class Consumables {

    @Id
    @GeneratedValue
    private int id;
    private String consumables;
    private Date as_on_date;
    private String count;

    public Consumables() {
    }

    public Consumables(int id, String consumables, Date as_on_date, String count) {
        this.id = id;
        this.consumables = consumables;
        this.as_on_date = as_on_date;
        this.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getConsumables() {
        return consumables;
    }

    public void setConsumables(String consumables) {
        this.consumables = consumables;
    }

    public Date getAs_on_date() {
        return as_on_date;
    }

    public void setAs_on_date(Date as_on_date) {
        this.as_on_date = as_on_date;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }
}
