package com.app.parallel;

public class MainParallel {

    public static void main(String[] args) throws InterruptedException {
        UserA userA = new UserA();
        UserB userB = new UserB();

        AThread aThread = new AThread(userA);
        BThread bThread = new BThread(userB);

        long start = System.currentTimeMillis();
        System.out.println("----------start in parallel----------");
        //userA.a();
        //userB.b();
        //aThread.run();
        //bThread.run();
        aThread.start();
        bThread.start();

        aThread.join();
        bThread.join();


        System.out.println("----------finish in parallel----------");
        long time = System.currentTimeMillis()-start;
        System.out.println("Total time="+time);
    }
}
