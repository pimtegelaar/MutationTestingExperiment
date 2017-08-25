package com.tegeltech.mutationtestingexperiment;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P1PrimeFinder000Test {
  private P1PrimeFinder000 p1PrimeFinder000;

  @Before
  public void setUp() {
    p1PrimeFinder000 = new P1PrimeFinder000();
  }

  @Test
  public void test104395303isPrime() {
    boolean result = p1PrimeFinder000.isPrime(104395303D);
    assertThat(result, is(true));
  }
}
