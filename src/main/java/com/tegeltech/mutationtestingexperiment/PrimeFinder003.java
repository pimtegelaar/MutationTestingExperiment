package com.tegeltech.mutationtestingexperiment;

import com.tegeltech.mutationtestingexperiment.util.Static0;
import com.tegeltech.mutationtestingexperiment.util.Static1;
import com.tegeltech.mutationtestingexperiment.util.Static2;
import com.tegeltech.mutationtestingexperiment.util.Static3;

public class PrimeFinder003 {
    public boolean isPrime(double n) {
        for (int i = 2; 2 * i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        Static0.doSomething();
        Static1.doSomething();
        Static2.doSomething();
        Static3.doSomething();
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
