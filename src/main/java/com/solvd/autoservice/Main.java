package com.solvd.autoservice;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class Main {

    public static void main(String[] args) {

        SaxParser parser = new SaxParser();
        Autoservice autoservice = parser.parse();

        System.out.println("AutoService " + autoservice);
    }


//    }
//    public Autoservice unmarshall() throws JAXBException, IOException {
//        JAXBContext context = JAXBContext.newInstance(Autoservice.class);
//        return (Autoservice) context.createUnmarshaller()
//                .unmarshal(new FileReader("autoservice.xml"));
//    }

}

