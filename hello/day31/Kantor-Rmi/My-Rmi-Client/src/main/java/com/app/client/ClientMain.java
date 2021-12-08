package com.app.client;

import com.app.calc.CalcEngineInter;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ClientMain {

    public static void main(String[] args) throws Exception{

        Registry registry = LocateRegistry.getRegistry(1057);
        CalcEngineInter remoteCalc = (CalcEngineInter) registry.lookup("//127.0.0.1/Kantor");
        int res = remoteCalc.add(3, 4);
        System.out.println("res = " + res);
    }
}
