package com.solvd.autoservice;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement (name = "autoservice")
public class Autoservice {

    private List<Client> clients;
    private List<Detail> details;
    private List<Employee> employees;
    private List<Order> orders;

    public List<Client> getClients() {
        return clients;
    }

    @XmlElementWrapper(name = "clients")
    @XmlElement(name = "client")
    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public List<Detail> getDetails() {
        return details;
    }

    @XmlElementWrapper(name = "details")
    @XmlElement(name = "detail")
    public void setDetails(List<Detail> details) {
        this.details = details;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    @XmlElementWrapper(name = "employees")
    @XmlElement(name = "employee")
    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Order> getOrders() {
        return orders;
    }

    @XmlElementWrapper(name = "orders")
    @XmlElement(name = "order")
    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
