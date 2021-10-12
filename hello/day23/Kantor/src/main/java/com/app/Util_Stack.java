package com.app;

import java.util.Stack;

public class Util_Stack {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");

        System.out.println(stack);
        System.out.println("stack size = " + stack.size());
        Object res = stack.peek();
        System.out.println("peak res = " + res);
        System.out.println("--------------------------------");
        stack.pop();
        System.out.println("delete one item");
        System.out.println(stack);
        System.out.println("stack size = " + stack.size());
        res = stack.peek();
        System.out.println("peak res = " + res);


    }

}
