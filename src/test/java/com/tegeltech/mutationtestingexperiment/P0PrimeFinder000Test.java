package com.tegeltech.mutationtestingexperiment;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P0PrimeFinder000Test {
  private P0PrimeFinder000 p0PrimeFinder000;

  @Before
  public void setUp() {
    p0PrimeFinder000 = new P0PrimeFinder000();
  }

  @Test
  public void test104395303isPrime() {
    boolean result = p0PrimeFinder000.isPrime(104395303D);
    assertThat(result, is(true));
  }
}
