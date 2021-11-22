package com.solvd.autoservice;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class JaxbParser {

    public Autoservice parse(String file) {

        File xmlFile = new File(file);

        JAXBContext jaxbContext;
        try {
            jaxbContext = JAXBContext.newInstance(Autoservice.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

            return (Autoservice) jaxbUnmarshaller.unmarshal(xmlFile);

        } catch (JAXBException e) {
            throw new RuntimeException("Jaxb parser exception." + "\n" + e.getMessage());
        }
    }
}
