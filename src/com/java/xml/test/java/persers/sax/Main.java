package com.java.xml.test.java.persers.sax;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SAXException, IOException {
        XMLReader reader = XMLReaderFactory.createXMLReader();
        MenuSaxHandler handler = new MenuSaxHandler();
        reader.setContentHandler(handler);
        reader.parse(new InputSource("src\\com\\java\\xml\\test\\java\\persers\\sax\\food.xml"));
        List<Food> foods = handler.getFoods();
        foods.forEach(System.out::println);
    }
}
