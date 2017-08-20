package com.tegeltech.mutationtestingexperiment;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class PrimeFinder002Test {
  private PrimeFinder002 primeFinder002;

  @Before
  public void setUp() {
    primeFinder002 = new PrimeFinder002();
  }

  @Test
  public void test104395303isPrime() {
    boolean result = primeFinder002.isPrime(104395303D);
    assertThat(result, is(true));
  }
}
