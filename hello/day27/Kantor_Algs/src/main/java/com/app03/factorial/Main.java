package com.app03.factorial;

public class Main {

    public static void main(String[] args) {
        int res = factorial(7);
        System.out.println("7! = " + res);
        res = factorialRecursion(6);
        System.out.println("6! = " + res + " (recursion)");
        System.out.println("----------------------------");
        res = factorialRecursionDebug(5, "");
        System.out.println("5! = " + res + "(recursion debug)");



    }

    private static int factorial(int n) {
        int p = 1;
        for (int i = 2; i <= n; i++) {
            p = p * i;
        }
        return p;
    }

    private static int factorialRecursion(int n) {
        if (n == 1) {
            return n;
        }
        return n * factorial(n - 1);
    }

    private static int factorialRecursionDebug(int n, String path) {
        System.out.println(path + n + " START");
        if (n == 1) {
            return n;
        }
        int childResult = factorialRecursionDebug(n - 1, path + "\t");
        System.out.println(path + n + " FINISH childResult = " + childResult);
        return n * childResult;
    }
}
