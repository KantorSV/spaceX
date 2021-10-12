package com.app.ch05.casting;

public class UpCasting {

    public static void main(String[] args) {

        //compilation error
        //Child child = new Parent();
        //child.speak();

        //good example
        Parent parent = new Child();
        Child child = (Child)parent;
        Helper.doAction(child);


        //ClassCastException
        //bad example
       /* Parent parent = new Parent();
        Child child = (Child)parent;
        System.out.println("qqqq");*/
    }

}
