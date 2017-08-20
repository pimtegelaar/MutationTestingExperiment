package com.tegeltech.mutationtestingexperiment;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class PrimeFinder005Test {
  private PrimeFinder005 primeFinder005;

  @Before
  public void setUp() {
    primeFinder005 = new PrimeFinder005();
  }

  @Test
  public void test104395303isPrime() {
    boolean result = primeFinder005.isPrime(104395303D);
    assertThat(result, is(true));
  }
}
