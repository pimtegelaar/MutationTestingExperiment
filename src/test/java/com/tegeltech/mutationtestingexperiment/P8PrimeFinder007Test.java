package com.tegeltech.mutationtestingexperiment;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P8PrimeFinder007Test {
  private P8PrimeFinder007 p8PrimeFinder007;

  @Before
  public void setUp() {
    p8PrimeFinder007 = new P8PrimeFinder007();
  }

  @Test
  public void test104395303isPrime() {
    boolean result = p8PrimeFinder007.isPrime(104395303D);
    assertThat(result, is(true));
  }
}
