package com.java.framework.delimiter;

import java.util.Locale;
import java.util.ResourceBundle;

public class Main {
    static final String CONFIG_BEANS_DELIMITER = ",\\s?";

    public static void main(String[] args) {
        Locale.setDefault(new Locale("en"));

        ResourceBundle bundleConfig = ResourceBundle.getBundle("com.java.framework.delimiter.config");

        String definitionsList = bundleConfig.getString("eps.bean.definitions");
        String[] epsBeanDefinitionsClassNames = definitionsList
                .split(CONFIG_BEANS_DELIMITER);
        for (String str : epsBeanDefinitionsClassNames) {
            System.out.println(str);
            System.out.println("----------------");
        }
    }
}
