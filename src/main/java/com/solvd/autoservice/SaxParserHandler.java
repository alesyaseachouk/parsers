package com.solvd.autoservice;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SaxParserHandler extends DefaultHandler {

    @Override
    public void startDocument() throws SAXException {
        System.out.println("Start Document");
    }

    @Override
    public void endDocument() throws SAXException {
        System.out.println("End Document");
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        System.out.println("Start Element " + qName);
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        System.out.println("End Element " + qName);
    }

//    @Override
//    public void characters(char[] ch, int start, int length) throws SAXException {
//        System.out.println("Characters " + new String(ch, start,length));
//        }

//        if(currentTagName.equals(TAG_NAME_MAIN)){
//            autoservice.xml.setClients((List<Client>) new Client(ch, start, length));
//        }
//    }
}


