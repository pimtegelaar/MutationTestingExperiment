package com.tegeltech.mutationtestingexperiment;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P8PrimeFinder006Test {
  private P8PrimeFinder006 p8PrimeFinder006;

  @Before
  public void setUp() {
    p8PrimeFinder006 = new P8PrimeFinder006();
  }

  @Test
  public void test104395303isPrime() {
    boolean result = p8PrimeFinder006.isPrime(104395303D);
    assertThat(result, is(true));
  }
}
