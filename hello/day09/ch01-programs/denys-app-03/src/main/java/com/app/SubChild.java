package com.app;

public class SubChild  extends  Child {

    public SubChild(){
        System.out.println("\t\tSubChild");
    }

    public void speak(){
        System.out.println("qqqqqqq from me");
    }


    public void speak(int n){

        for(int i=0;i<n;i++){
            System.out.println("Hello !!!!! "+i);
        }

    }


    public void tv(){

    }

}
