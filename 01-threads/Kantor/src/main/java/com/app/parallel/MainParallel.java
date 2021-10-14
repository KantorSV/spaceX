package com.app.parallel;

public class MainParallel {

    public static void main(String[] args) throws InterruptedException{

        UserA userA = new UserA();
        UserB userB = new UserB();

        AThread aThread = new AThread(userA);
        BThread bThread = new BThread(userB);

        long start = System.currentTimeMillis();
        System.out.println("-----------------start in parallel----------------------");
        aThread.start();
        bThread.start();

        //userA.a();
        //userB.b();
        //aThread.run();
        //bThread.run();


        aThread.join();
        bThread.join();

        System.out.println("----------------finish in parallel----------------------");
        long time = System.currentTimeMillis() - start;
        System.out.println("total time = " + time);
    }
}
