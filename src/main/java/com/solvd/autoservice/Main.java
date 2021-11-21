package com.solvd.autoservice;

public class Main {

    public static void main(String[] args) {

        SaxParser parser = new SaxParser();
        Autoservice autoservice = parser.parse();

        System.out.println("AutoService " + autoservice);

    }
}

