package com.tegeltech.mutationtestingexperiment;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P8PrimeFinder005Test {
  private P8PrimeFinder005 p8PrimeFinder005;

  @Before
  public void setUp() {
    p8PrimeFinder005 = new P8PrimeFinder005();
  }

  @Test
  public void test104395303isPrime() {
    boolean result = p8PrimeFinder005.isPrime(104395303D);
    assertThat(result, is(true));
  }
}
