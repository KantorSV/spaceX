package com.app.calc;

import java.io.Serializable;
import java.rmi.RemoteException;

public class CalcEngine implements CalcEngineInter, Serializable {
    @Override
    public int add(int a, int b) throws RemoteException {
        int sum = a+b;
        System.out.println("a + b = " + sum);
        return sum;
    }
}
