package com.tegeltech.mutationtestingexperiment;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class PrimeFinder018Test {
  private PrimeFinder018 primeFinder018;

  @Before
  public void setUp() {
    primeFinder018 = new PrimeFinder018();
  }

  @Test
  public void test104395303isPrime() {
    boolean result = primeFinder018.isPrime(104395303D);
    assertThat(result, is(true));
  }
}
