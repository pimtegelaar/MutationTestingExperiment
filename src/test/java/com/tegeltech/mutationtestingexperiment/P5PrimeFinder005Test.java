package com.tegeltech.mutationtestingexperiment;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P5PrimeFinder005Test {
  private P5PrimeFinder005 p5PrimeFinder005;

  @Before
  public void setUp() {
    p5PrimeFinder005 = new P5PrimeFinder005();
  }

  @Test
  public void test104395303isPrime() {
    boolean result = p5PrimeFinder005.isPrime(104395303D);
    assertThat(result, is(true));
  }
}
