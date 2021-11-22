package com.solvd.autoservice;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.List;

public class Order implements Serializable {

    private List<Client> clients;
    private List<Detail> details;

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


}
