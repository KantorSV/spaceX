package com.company;

import com.app.BusinessProcessor;
import org.app.MyChecker;

public class Main {

    public static void main(String[] args) {

        BusinessProcessor businessProcessor = new BusinessProcessor();
        businessProcessor.showMessage("Denis");

        System.out.println("------------------");
        MyChecker myChecker = new MyChecker();
        boolean res = myChecker.check(21);
        System.out.println("res="+res);

    }
}
