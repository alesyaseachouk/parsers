package com.solvd.autoservice;

import java.util.List;

public class Autoservice {

    private List<Client> clientList;
    private List<Detail> details;
    private List<Employee> employees;
    private List<Order> orders;

    public List<Client> getClients() {
        return clientList;
    }

    public void setClients(List<Client> clients) {
        this.clientList = clientList;
    }

    public List<Detail> getDetails() {
        return details;
    }

    public void setDetails(List<Detail> details) {
        this.details = details;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
