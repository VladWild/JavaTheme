package com.java.InputOutput;

import java.io.*;
import java.util.Scanner;

public class MainInputOutput {
    public static final String fileName = "d:\\file.txt";

    public static void main(String[] args) {
        //InputStream
        //Writer

        InputStreamReader r = new InputStreamReader(System.in);
        char a;
            try {
                do{
                a = (char) r.read();
                System.out.println(a);
                } while (a != 'q');
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println();


        try {
            FileWriter fw = new FileWriter(fileName);
            BufferedWriter bw = new BufferedWriter(fw);
            System.out.println("Write some data to file: " + fileName);

            for(int i = 1; i < 65000; i++)
                bw.write((char) i);
                bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

