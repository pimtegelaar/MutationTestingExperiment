package com.tegeltech.mutationtestingexperiment;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class PrimeFinder016Test {
  private PrimeFinder016 primeFinder016;

  @Before
  public void setUp() {
    primeFinder016 = new PrimeFinder016();
  }

  @Test
  public void test104395303isPrime() {
    boolean result = primeFinder016.isPrime(104395303D);
    assertThat(result, is(true));
  }
}
