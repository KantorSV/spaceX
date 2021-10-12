package com.app;

public class Helper {

    public static void printLines(int n) {
        int i = 0;
        while (i <= n) {
            System.out.println("### " + i);
            i = i + 2;
        }
    }
}
