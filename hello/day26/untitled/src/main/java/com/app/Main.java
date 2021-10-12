package com.app;

public class Main {



    public static void main(String[] args) {
        Main main = new Main();

        byte v1=0;
        short v2=0;
        int v3 = 0;
        long v4 = 0;
        float v5= 0;
        double v6 = 0;

        Byte w1 = 1;
        Short w2 = 2;
        Integer w3 = 3;
        Long w4 = 4l;


        //main.doAction(w1);
        main.doActionObject(v3);
    }



    public void doActionObject(Integer b){
        System.out.println("b="+b);
    }


    public void doAction(int a){
        System.out.println("a="+a);
    }
}
