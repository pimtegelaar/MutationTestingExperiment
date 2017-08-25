package com.tegeltech.mutationtestingexperiment;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P5PrimeFinder004Test {
  private P5PrimeFinder004 p5PrimeFinder004;

  @Before
  public void setUp() {
    p5PrimeFinder004 = new P5PrimeFinder004();
  }

  @Test
  public void test104395303isPrime() {
    boolean result = p5PrimeFinder004.isPrime(104395303D);
    assertThat(result, is(true));
  }
}
