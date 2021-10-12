package com.app;

public class Main {

    public static void main(String[] args) {
        Tv lgTv = new Tv();
        lgTv.name="LG";

        Pult pultLg = new Pult();
        pultLg.pultName="Pult for LG";
        pultLg.tv = lgTv;

        pultLg.makeSound(50);
        int lgSound = lgTv.sound;
        System.out.println("lgSound="+lgSound);

        pultLg.changeCanal(5);
        int lgCanal = lgTv.canal;
        System.out.println("lgCanal="+lgCanal);

        System.out.println("---------------------------");
        Tv philipsTv = new Tv();
        philipsTv.name="philips";

        Pult philipsPult = new Pult();
        philipsPult.pultName="Philips pult";
        philipsPult.tv=philipsTv;

        philipsPult.makeSound(90);
        int philipsSound = philipsTv.sound;

        System.out.println("philipsSound="+philipsSound);
        lgSound = lgTv.sound;
        System.out.println("lgSound="+lgSound);

        System.out.println("----------update references------------");
        philipsPult.tv = lgTv;
        philipsPult.makeSound(500);

        lgSound = lgTv.sound;
        philipsSound = philipsTv.sound;
        System.out.println("lgSound="+lgSound);
        System.out.println("philipsSound="+philipsSound);






    }

}
