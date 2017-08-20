package com.tegeltech.mutationtestingexperiment;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class PrimeFinder006Test {
  private PrimeFinder006 primeFinder006;

  @Before
  public void setUp() {
    primeFinder006 = new PrimeFinder006();
  }

  @Test
  public void test104395303isPrime() {
    boolean result = primeFinder006.isPrime(104395303D);
    assertThat(result, is(true));
  }
}
