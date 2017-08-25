package com.tegeltech.mutationtestingexperiment;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P6PrimeFinder000Test {
  private P6PrimeFinder000 p6PrimeFinder000;

  @Before
  public void setUp() {
    p6PrimeFinder000 = new P6PrimeFinder000();
  }

  @Test
  public void test104395303isPrime() {
    boolean result = p6PrimeFinder000.isPrime(104395303D);
    assertThat(result, is(true));
  }
}
