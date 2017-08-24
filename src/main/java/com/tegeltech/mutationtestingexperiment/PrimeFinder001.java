package com.tegeltech.mutationtestingexperiment;

import com.tegeltech.mutationtestingexperiment.util.Static0;
import com.tegeltech.mutationtestingexperiment.util.Static1;

public class PrimeFinder001 {
    public boolean isPrime(double n) {
        for (int i = 2; 2 * i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        Static0.doSomething();
        Static1.doSomething();
        doSomething();
        doSomething();
        doSomething();
        doSomething();
        doSomething();
        doSomething();
        doSomething();
        doSomething();
        return true;
    }

    public void doSomething() {
    }
}
