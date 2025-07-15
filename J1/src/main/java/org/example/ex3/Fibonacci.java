package org.example.ex3;

public class Fibonacci {
    public static long findFibonacci(int n) {
        if (n > 92) {
            throw new NumberFormatException("Too large n");
        }

        if(n == 1 || n == 2) {
            return 1;
        }

        return findFibonacci(n - 1) + findFibonacci(n - 2);
    }
}
