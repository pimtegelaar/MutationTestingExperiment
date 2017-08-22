package com.tegeltech.mutationtestingexperiment;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class PrimeFinder011Test {
  private PrimeFinder011 primeFinder011;

  @Before
  public void setUp() {
    primeFinder011 = new PrimeFinder011();
  }

  @Test
  public void test104395303isPrime() {
    boolean result = primeFinder011.isPrime(104395303D);
    assertThat(result, is(true));
  }
}
