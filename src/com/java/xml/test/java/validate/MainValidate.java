package com.java.xml.test.java.validate;

import org.xml.sax.SAXException;

import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;

public class MainValidate {
    private static final String XSD = "src\\com\\java\\xml\\test\\java\\validate\\note.xsd";
    private static final String XML = "src\\com\\java\\xml\\test\\java\\validate\\note.xml";

    public static void main(String[] args) throws SAXException {
        // 1. Поиск и создание экземпляра фабрики для языка XML Schema
        SchemaFactory factory = SchemaFactory
                .newInstance("http://www.w3.org/2001/XMLSchema");
        // 2. Компиляция схемы
        File schemaLocation = new File(XSD);
        Schema schema = factory.newSchema(schemaLocation);
        // 3. Создание валидатора для схемы
        Validator validator = schema.newValidator();
        // 4. Разбор проверяемого документа
        Source source = new StreamSource(XML);
        // 5. Валидация документа
        try {
            validator.validate(source);
            System.out.println(" valid ");
        } catch (IOException e) {
            System.out.println(" is not valid ");
            e.printStackTrace();
        }

    }
}
