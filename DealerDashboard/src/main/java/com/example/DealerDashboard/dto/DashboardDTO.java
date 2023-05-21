package com.example.DealerDashboard.dto;

public class DashboardDTO {

    private int id;
    private String date;
    private int total_procedures;
    private int total_order;
    private int return_pending;
    private String percentage;

    // Constructor (if needed)

    public DashboardDTO() {
    }

    public DashboardDTO(int id, String date, int total_procedures, int total_order, int return_pending, String percentage) {
        this.id = id;
        this.date = date;
        this.total_procedures = total_procedures;
        this.total_order = total_order;
        this.return_pending = return_pending;
        this.percentage = percentage;
    }
    // Getter and Setter methods

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getTotal_procedures() {
        return total_procedures;
    }

    public void setTotal_procedures(int total_procedures) {
        this.total_procedures = total_procedures;
    }

    public int getTotal_order() {
        return total_order;
    }

    public void setTotal_order(int total_order) {
        this.total_order = total_order;
    }

    public int getReturn_pending() {
        return return_pending;
    }

    public void setReturn_pending(int return_pending) {
        this.return_pending = return_pending;
    }

    public String getPercentage() {
        return percentage;
    }

    public void setPercentage(String percentage) {
        this.percentage = percentage;
    }
}
