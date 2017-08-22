package com.tegeltech.mutationtestingexperiment;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class PrimeFinder010Test {
  private PrimeFinder010 primeFinder010;

  @Before
  public void setUp() {
    primeFinder010 = new PrimeFinder010();
  }

  @Test
  public void test104395303isPrime() {
    boolean result = primeFinder010.isPrime(104395303D);
    assertThat(result, is(true));
  }
}
