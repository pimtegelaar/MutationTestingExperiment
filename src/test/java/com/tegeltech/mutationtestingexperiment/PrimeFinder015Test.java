package com.tegeltech.mutationtestingexperiment;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class PrimeFinder015Test {
  private PrimeFinder015 primeFinder015;

  @Before
  public void setUp() {
    primeFinder015 = new PrimeFinder015();
  }

  @Test
  public void test104395303isPrime() {
    boolean result = primeFinder015.isPrime(104395303D);
    assertThat(result, is(true));
  }
}
