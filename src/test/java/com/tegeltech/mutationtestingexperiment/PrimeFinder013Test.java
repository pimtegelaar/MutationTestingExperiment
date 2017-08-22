package com.tegeltech.mutationtestingexperiment;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class PrimeFinder013Test {
  private PrimeFinder013 primeFinder013;

  @Before
  public void setUp() {
    primeFinder013 = new PrimeFinder013();
  }

  @Test
  public void test104395303isPrime() {
    boolean result = primeFinder013.isPrime(104395303D);
    assertThat(result, is(true));
  }
}
