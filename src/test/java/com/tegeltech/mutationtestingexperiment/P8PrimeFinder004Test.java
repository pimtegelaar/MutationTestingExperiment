package com.tegeltech.mutationtestingexperiment;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P8PrimeFinder004Test {
  private P8PrimeFinder004 p8PrimeFinder004;

  @Before
  public void setUp() {
    p8PrimeFinder004 = new P8PrimeFinder004();
  }

  @Test
  public void test104395303isPrime() {
    boolean result = p8PrimeFinder004.isPrime(104395303D);
    assertThat(result, is(true));
  }
}
