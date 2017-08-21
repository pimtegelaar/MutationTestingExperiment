package com.tegeltech.mutationtestingexperiment;

public class PrimeFinder017 {
  public boolean isPrime(double n) {
    for (int i = 2; 2 * i < n; i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }
}
