package com.app;

public class Main {

    public static void main(String[] args) {
        //Tv tv = new Tv();
        SamsungTv samsungTv = new SamsungTv();
        samsungTv.show();
        System.out.println("----------------");
        PhilipsTv philipsTv = new PhilipsTv();
        philipsTv.show();
        System.out.println("----------------");
        SonyTv sonyTv = new SonyTv();
        sonyTv.show();
        System.out.println("####################################");
        //IS-A samsung is-a tv
        Tv a = new SonyTv();
        a.show();
        //a.plusSound();
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        int type = 90;
        Tv b = getTv(type);
        b.show();

        //SomeTv someTv = new SomeTvChild();
        //someTv.show();
        //someTv.turnOff();
    }


    //factory method
    public static Tv getTv(int type){
        Tv tv = null;
        switch (type){
            case 0:
              tv = new SamsungTv();
              break;
            case 1:
              tv = new PhilipsTv();
              break;
            default:
                tv = new SonyTv();
        }
        return tv;
    }


}
