package com.tegeltech.mutationtestingexperiment;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P5PrimeFinder001Test {
  private P5PrimeFinder001 p5PrimeFinder001;

  @Before
  public void setUp() {
    p5PrimeFinder001 = new P5PrimeFinder001();
  }

  @Test
  public void test104395303isPrime() {
    boolean result = p5PrimeFinder001.isPrime(104395303D);
    assertThat(result, is(true));
  }
}
