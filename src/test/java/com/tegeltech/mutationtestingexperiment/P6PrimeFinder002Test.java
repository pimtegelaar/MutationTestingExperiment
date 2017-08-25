package com.tegeltech.mutationtestingexperiment;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P6PrimeFinder002Test {
  private P6PrimeFinder002 p6PrimeFinder002;

  @Before
  public void setUp() {
    p6PrimeFinder002 = new P6PrimeFinder002();
  }

  @Test
  public void test104395303isPrime() {
    boolean result = p6PrimeFinder002.isPrime(104395303D);
    assertThat(result, is(true));
  }
}
