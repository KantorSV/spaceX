package com.app.calc;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CalcEngineInter extends Remote {

    public int add(int a, int b) throws RemoteException;

}
