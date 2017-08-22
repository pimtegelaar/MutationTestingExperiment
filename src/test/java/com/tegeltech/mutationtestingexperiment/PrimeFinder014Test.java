package com.tegeltech.mutationtestingexperiment;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class PrimeFinder014Test {
  private PrimeFinder014 primeFinder014;

  @Before
  public void setUp() {
    primeFinder014 = new PrimeFinder014();
  }

  @Test
  public void test104395303isPrime() {
    boolean result = primeFinder014.isPrime(104395303D);
    assertThat(result, is(true));
  }
}
