package com.app;

public class Main {
    public static void main(String[] args) {
        SerheiiProcessor s = new SerheiiProcessor();
        s.doProcess();

        System.out.println("-----------------");
        DenisProcessor d = new DenisProcessor();
        d.doProcess();

        System.out.println("-----------------");
        MyProcessor myProcessor = new DenisProcessor();
        myProcessor.doProcess();

        System.out.println("-----------------");
        MyProcessor z = new MyProcessor() {
            @Override
            public void doProcess() {
                System.out.println("anonimus processor");
            }
        };
        z.doProcess();

        System.out.println("-----------------");
        SerheiiProcessor sp = new SerheiiProcessor(){

            public void doProcess() {
                System.out.println("SERHEII UPDATED");
                super.doProcess();
            }

        };
        sp.doProcess();
    }
}
