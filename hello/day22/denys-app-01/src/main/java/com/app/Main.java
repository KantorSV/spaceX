package com.app;

import java.io.File;
import java.io.PrintStream;

public class Main {

    public static void main(String[] args) {
        try {
            File file = new File("denys.txt");
            PrintStream printStream = new PrintStream(file);
            System.setOut(printStream);
            System.out.println("Hello, Apllication");
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }


}
