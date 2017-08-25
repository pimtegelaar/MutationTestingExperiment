package com.tegeltech.mutationtestingexperiment;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P5PrimeFinder000Test {
  private P5PrimeFinder000 p5PrimeFinder000;

  @Before
  public void setUp() {
    p5PrimeFinder000 = new P5PrimeFinder000();
  }

  @Test
  public void test104395303isPrime() {
    boolean result = p5PrimeFinder000.isPrime(104395303D);
    assertThat(result, is(true));
  }
}
