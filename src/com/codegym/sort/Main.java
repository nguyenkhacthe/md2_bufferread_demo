package com.codegym.sort;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("person.txt"));
            String file = reader.readLine();

            while (file != null) {
                System.out.println(file);
                file = reader.readLine();
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
