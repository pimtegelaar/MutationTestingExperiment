package com.tegeltech.mutationtestingexperiment;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P6PrimeFinder004Test {
  private P6PrimeFinder004 p6PrimeFinder004;

  @Before
  public void setUp() {
    p6PrimeFinder004 = new P6PrimeFinder004();
  }

  @Test
  public void test104395303isPrime() {
    boolean result = p6PrimeFinder004.isPrime(104395303D);
    assertThat(result, is(true));
  }
}
