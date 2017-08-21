package com.tegeltech.mutationtestingexperiment;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class PrimeFinder007Test {
  private PrimeFinder007 primeFinder007;

  @Before
  public void setUp() {
    primeFinder007 = new PrimeFinder007();
  }

  @Test
  public void test104395303isPrime() {
    boolean result = primeFinder007.isPrime(104395303D);
    assertThat(result, is(true));
  }
}
