package com.app.calc;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Main {

    public static void main(String[] args) throws Exception{

        CalcEngine calcEngine = new CalcEngine();
        Registry registry = LocateRegistry.createRegistry(1057);
        registry.bind("//127.0.0.1/Kantor", calcEngine);

        System.out.println("Server is READY");
        Thread.sleep(Integer.MAX_VALUE);
    }
}
