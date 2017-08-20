package com.tegeltech.mutationtestingexperiment;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class PrimeFinder008Test {
  private PrimeFinder008 primeFinder008;

  @Before
  public void setUp() {
    primeFinder008 = new PrimeFinder008();
  }

  @Test
  public void test104395303isPrime() {
    boolean result = primeFinder008.isPrime(104395303D);
    assertThat(result, is(true));
  }
}
