package com.tegeltech.mutationtestingexperiment;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class PrimeFinder000Test {
  private PrimeFinder000 primeFinder000;

  @Before
  public void setUp() {
    primeFinder000 = new PrimeFinder000();
  }

  @Test
  public void testCanDetermineThatBigPrimeIsPrime() {
//    boolean result = primeFinder000.isPrime(104395303D);
//        boolean result = primeFinder000.isPrime(179424691d);
//        boolean result = primeFinder000.isPrime(256203221d);
//        boolean result = primeFinder000.isPrime(334214467d);
        boolean result = primeFinder000.isPrime(413158523d);
//        boolean result = primeFinder000.isPrime(492876863d);
//        boolean result = primeFinder000.isPrime(573259433d);
//        boolean result = primeFinder000.isPrime(654188429d);
//        boolean result = primeFinder000.isPrime(735632797d);
//        boolean result = primeFinder000.isPrime(817504253d);
//        boolean result = primeFinder000.isPrime(899809363d);
    assertThat(result, is(true));
  }
}
