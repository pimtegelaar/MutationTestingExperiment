package com.tegeltech.mutationtestingexperiment;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class PrimeFinder004Test {
  private PrimeFinder004 primeFinder004;

  @Before
  public void setUp() {
    primeFinder004 = new PrimeFinder004();
  }

  @Test
  public void test104395303isPrime() {
    boolean result = primeFinder004.isPrime(104395303D);
    assertThat(result, is(true));
  }
}
