package com.tegeltech.mutationtestingexperiment;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class PrimeFinder012Test {
  private PrimeFinder012 primeFinder012;

  @Before
  public void setUp() {
    primeFinder012 = new PrimeFinder012();
  }

  @Test
  public void test104395303isPrime() {
    boolean result = primeFinder012.isPrime(104395303D);
    assertThat(result, is(true));
  }
}
