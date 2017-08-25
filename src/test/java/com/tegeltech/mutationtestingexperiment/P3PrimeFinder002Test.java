package com.tegeltech.mutationtestingexperiment;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P3PrimeFinder002Test {
  private P3PrimeFinder002 p3PrimeFinder002;

  @Before
  public void setUp() {
    p3PrimeFinder002 = new P3PrimeFinder002();
  }

  @Test
  public void test104395303isPrime() {
    boolean result = p3PrimeFinder002.isPrime(104395303D);
    assertThat(result, is(true));
  }
}
