package com.tegeltech.mutationtestingexperiment;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class PrimeFinder003Test {
  private PrimeFinder003 primeFinder003;

  @Before
  public void setUp() {
    primeFinder003 = new PrimeFinder003();
  }

  @Test
  public void test104395303isPrime() {
    boolean result = primeFinder003.isPrime(104395303D);
    assertThat(result, is(true));
  }
}
