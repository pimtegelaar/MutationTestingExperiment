package com.tegeltech.mutationtestingexperiment;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P5PrimeFinder002Test {
  private P5PrimeFinder002 p5PrimeFinder002;

  @Before
  public void setUp() {
    p5PrimeFinder002 = new P5PrimeFinder002();
  }

  @Test
  public void test104395303isPrime() {
    boolean result = p5PrimeFinder002.isPrime(104395303D);
    assertThat(result, is(true));
  }
}
