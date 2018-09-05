package com.java.xml.test.java.persers.dom;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainDom {
    private static final String FILE = "src\\com\\java\\xml\\test\\java\\persers\\dom\\file.xml";

    public static void main(String[] args) throws ParserConfigurationException,
            IOException, SAXException, TransformerException {
        //-----------------------------------------------------------------
        //создание документа и получение корневого элемента
        DocumentBuilder builder = DocumentBuilderFactory
                .newInstance()
                .newDocumentBuilder();
        Document document = builder.parse(FILE);
        Element root = document.getDocumentElement();

        //-----------------------------------------------------------------
        root.replaceChild(root.getFirstChild(), root.getLastChild());

        //-----------------------------------------------------------------
        //сохранение добавленых элементов
        Transformer t = TransformerFactory
                .newInstance()
                .newTransformer();
        //элементы xml не в одну строчку
        t.setOutputProperty(OutputKeys.INDENT, "yes");
        t.transform(new DOMSource(document), new StreamResult(new FileOutputStream(FILE)));
    }
}


