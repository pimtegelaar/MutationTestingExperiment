package com.tegeltech.mutationtestingexperiment;

public class PrimeFinder002 {
  public boolean isPrime(double n) {
    for (int i = 2; 2 * i < n; i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }
  // change 2
  // change 3
  // change 4
  // change 5
}
