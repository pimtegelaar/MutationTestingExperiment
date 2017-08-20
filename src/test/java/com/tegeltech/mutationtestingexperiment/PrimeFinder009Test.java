package com.tegeltech.mutationtestingexperiment;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class PrimeFinder009Test {
  private PrimeFinder009 primeFinder009;

  @Before
  public void setUp() {
    primeFinder009 = new PrimeFinder009();
  }

  @Test
  public void test104395303isPrime() {
    boolean result = primeFinder009.isPrime(104395303D);
    assertThat(result, is(true));
  }
}
