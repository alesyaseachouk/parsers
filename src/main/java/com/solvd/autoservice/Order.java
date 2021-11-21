package com.solvd.autoservice;

import java.util.List;

public class Order {

    private List<Client> clients;
    private List<Detail> details;

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public List<Detail> getDetails() {
        return details;
    }

    public void setDetails(List<Detail> details) {
        this.details = details;
    }


}
