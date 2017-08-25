package com.tegeltech.mutationtestingexperiment;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P8PrimeFinder008Test {
  private P8PrimeFinder008 p8PrimeFinder008;

  @Before
  public void setUp() {
    p8PrimeFinder008 = new P8PrimeFinder008();
  }

  @Test
  public void test104395303isPrime() {
    boolean result = p8PrimeFinder008.isPrime(104395303D);
    assertThat(result, is(true));
  }
}
