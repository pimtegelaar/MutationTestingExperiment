package com.tegeltech.mutationtestingexperiment;

public class P2PrimeFinder000 extends Parent2 {
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
