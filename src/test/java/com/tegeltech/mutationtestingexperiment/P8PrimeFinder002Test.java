package com.tegeltech.mutationtestingexperiment;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P8PrimeFinder002Test {
  private P8PrimeFinder002 p8PrimeFinder002;

  @Before
  public void setUp() {
    p8PrimeFinder002 = new P8PrimeFinder002();
  }

  @Test
  public void test104395303isPrime() {
    boolean result = p8PrimeFinder002.isPrime(104395303D);
    assertThat(result, is(true));
  }
}
