package com.tegeltech.mutationtestingexperiment;

public class PrimeFinder005 {
  public boolean isPrime(double n) {
    for (int i = 2; 2 * i < n; i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }
  // change 5
  // change 6
  // change 7
  // change 8
  // change 9
}
