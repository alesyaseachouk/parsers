package com.solvd.autoservice;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class JaxbReader {

    public static void main (String[] args) throws JAXBException {
        File file = new File("src/main/resources/autoservice.xml");
        JAXBContext context = JAXBContext.newInstance(Autoservice.class);

        Unmarshaller unmarshaller = context.createUnmarshaller();
        Autoservice autoservice = (Autoservice) unmarshaller.unmarshal(file);
        System.out.println(autoservice.getClients());
        System.out.println(autoservice.getDetails());
        System.out.println(autoservice.getEmployees());
        System.out.println(autoservice.getOrders());
    }
}
