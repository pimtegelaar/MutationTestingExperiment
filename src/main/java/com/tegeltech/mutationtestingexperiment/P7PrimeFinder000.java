package com.tegeltech.mutationtestingexperiment;

public class P7PrimeFinder000 extends Parent7 {
  public boolean isPrime(double n) {
    for (int i = 2; 2 * i < n; i++) {
      if (n % i == 0) {
        return false;
      }
    }
    doSomething();
    return true;
  }
}
