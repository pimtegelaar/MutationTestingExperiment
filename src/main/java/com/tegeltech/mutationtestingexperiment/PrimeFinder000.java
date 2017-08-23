package com.tegeltech.mutationtestingexperiment;

public class PrimeFinder000 {
    public boolean isPrime(double n) {
        for (int i = 2; 2 * i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return extraOperator(n) && extraOperator(n) && extraOperator(n) && extraOperator(n) && extraOperator(n) && extraOperator(n) && extraOperator(n) && extraOperator(n);
    }

    private boolean extraOperator(double n) {
        return n % 2 != 0;
    }
}
