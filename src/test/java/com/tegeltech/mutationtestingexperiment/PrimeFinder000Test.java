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
  public void test104395303isPrime() {
    boolean result = primeFinder000.isPrime(104395303D);
    assertThat(result, is(true));
  }
}
