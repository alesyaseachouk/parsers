package com.solvd.autoservice;

import jdk.internal.org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public interface Parserable {

    public Autoservice parse() throws ParserConfigurationException, SAXException, IOException;

}
