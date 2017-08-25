package com.tegeltech.mutationtestingexperiment;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P6PrimeFinder005Test {
  private P6PrimeFinder005 p6PrimeFinder005;

  @Before
  public void setUp() {
    p6PrimeFinder005 = new P6PrimeFinder005();
  }

  @Test
  public void test104395303isPrime() {
    boolean result = p6PrimeFinder005.isPrime(104395303D);
    assertThat(result, is(true));
  }
}
