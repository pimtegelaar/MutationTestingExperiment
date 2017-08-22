package com.tegeltech.mutationtestingexperiment;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class PrimeFinder017Test {
  private PrimeFinder017 primeFinder017;

  @Before
  public void setUp() {
    primeFinder017 = new PrimeFinder017();
  }

  @Test
  public void test104395303isPrime() {
    boolean result = primeFinder017.isPrime(104395303D);
    assertThat(result, is(true));
  }
}
