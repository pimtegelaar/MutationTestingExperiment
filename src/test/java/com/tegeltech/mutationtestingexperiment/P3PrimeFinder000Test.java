package com.tegeltech.mutationtestingexperiment;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P3PrimeFinder000Test {
  private P3PrimeFinder000 p3PrimeFinder000;

  @Before
  public void setUp() {
    p3PrimeFinder000 = new P3PrimeFinder000();
  }

  @Test
  public void test104395303isPrime() {
    boolean result = p3PrimeFinder000.isPrime(104395303D);
    assertThat(result, is(true));
  }
}
