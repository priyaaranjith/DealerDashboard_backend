package com.example.DealerDashboard.dto;

import java.util.Date;

public class ConsumablesDTO {

    private int id;
    private String consumables;
    private Date as_on_date;
    private String count;

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
