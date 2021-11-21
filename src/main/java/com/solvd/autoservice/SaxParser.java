package com.solvd.autoservice;

import org.xml.sax.SAXException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;

public class SaxParser implements Parserable {

    public Autoservice parse (){

        SAXParserFactory factory = SAXParserFactory.newInstance();
        SaxParserHandler handler = new SaxParserHandler();
        SAXParser parser = null;
        try {
            parser = factory.newSAXParser();
        } catch (Exception e) {
            System.out.println("Open Sax parser error " + e.toString());
            return null;
        }
        File file = new File("src/main/resources/autoservice.xml");
        try {
            parser.parse(file, handler);
        } catch (SAXException e) {
            System.out.println("Sax Parsing error "+ e.toString());
            return null;
        } catch (IOException e) {
            System.out.println("IO Parsing error " + e.toString());
            return null;
        }
        return null;
    }
}
