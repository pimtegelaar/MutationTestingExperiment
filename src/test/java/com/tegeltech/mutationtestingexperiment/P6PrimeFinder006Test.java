package com.tegeltech.mutationtestingexperiment;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P6PrimeFinder006Test {
  private P6PrimeFinder006 p6PrimeFinder006;

  @Before
  public void setUp() {
    p6PrimeFinder006 = new P6PrimeFinder006();
  }

  @Test
  public void test104395303isPrime() {
    boolean result = p6PrimeFinder006.isPrime(104395303D);
    assertThat(result, is(true));
  }
}
