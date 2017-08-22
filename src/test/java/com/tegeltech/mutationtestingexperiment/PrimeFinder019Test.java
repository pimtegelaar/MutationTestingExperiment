package com.tegeltech.mutationtestingexperiment;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class PrimeFinder019Test {
  private PrimeFinder019 primeFinder019;

  @Before
  public void setUp() {
    primeFinder019 = new PrimeFinder019();
  }

  @Test
  public void test104395303isPrime() {
    boolean result = primeFinder019.isPrime(104395303D);
    assertThat(result, is(true));
  }
}
