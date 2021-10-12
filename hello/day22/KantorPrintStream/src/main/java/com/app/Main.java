package com.app;

import java.io.File;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("Kantor.txt");
            PrintStream printStream = new PrintStream(file);
            System.setOut(printStream);
            System.out.println("1987");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
