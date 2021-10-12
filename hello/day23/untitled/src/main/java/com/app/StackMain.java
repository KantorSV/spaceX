package com.app;

import java.util.Stack;

public class StackMain {

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");

        System.out.println("stack.size="+stack.size());
        Object res = stack.peek();
        System.out.println("res="+res);
        System.out.println("stack="+stack);
        System.out.println("stack.size="+stack.size());
        System.out.println("---------------");
        res = stack.pop();
        System.out.println("res="+res);
        System.out.println("stack="+stack);
        System.out.println("stack.size="+stack.size());
        res = stack.peek();
        System.out.println("res="+res);
        System.out.println("stack="+stack);

    }
}
