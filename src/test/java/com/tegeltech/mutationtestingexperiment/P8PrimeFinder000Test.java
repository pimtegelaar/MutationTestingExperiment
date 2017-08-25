package com.tegeltech.mutationtestingexperiment;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P8PrimeFinder000Test {
  private P8PrimeFinder000 p8PrimeFinder000;

  @Before
  public void setUp() {
    p8PrimeFinder000 = new P8PrimeFinder000();
  }

  @Test
  public void test104395303isPrime() {
    boolean result = p8PrimeFinder000.isPrime(104395303D);
    assertThat(result, is(true));
  }
}
