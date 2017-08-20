package com.tegeltech.mutationtestingexperiment;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class PrimeFinder001Test {
  private PrimeFinder001 primeFinder001;

  @Before
  public void setUp() {
    primeFinder001 = new PrimeFinder001();
  }

  @Test
  public void test104395303isPrime() {
    boolean result = primeFinder001.isPrime(104395303D);
    assertThat(result, is(true));
  }
}
