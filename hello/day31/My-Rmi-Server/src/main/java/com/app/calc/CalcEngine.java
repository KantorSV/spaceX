package com.app.calc;

import java.io.Serializable;

public class CalcEngine implements CalcEngineInter, Serializable {

    private static final long serialVersionUID = 1L;

    public int add(int a, int b){
        int sum = a+b;
        System.out.println("(a+b)="+sum);
        return sum;
    }


}
