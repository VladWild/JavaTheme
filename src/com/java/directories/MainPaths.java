package com.java.directories;

import java.nio.file.Path;
import java.nio.file.Paths;

public class MainPaths {

    private static final String pathStr = "C:\\Users\\v.v.gusev\\Documents\\Projects\\examples2\\myfile.zip";

    public static void main(String[] args) {
        Path path = Paths.get(pathStr);
        String pathFile = path.getParent().toString();
        System.out.println(pathFile);
    }
}
