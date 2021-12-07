package com.app.calc;

import java.rmi.RMISecurityManager;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Main {

    public static void main(String[] args) throws Exception {
        System.setSecurityManager(null);
        CalcEngine calcEngine = new CalcEngine();
        Registry registry = LocateRegistry.createRegistry(1099);
        registry.bind("//127.0.0.1/calculator", calcEngine);

        System.out.println("SERVER IS READY");
        Thread.sleep(Integer.MAX_VALUE);
    }
}
