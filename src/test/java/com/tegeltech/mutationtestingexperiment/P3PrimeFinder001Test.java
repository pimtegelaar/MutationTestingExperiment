package com.tegeltech.mutationtestingexperiment;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P3PrimeFinder001Test {
  private P3PrimeFinder001 p3PrimeFinder001;

  @Before
  public void setUp() {
    p3PrimeFinder001 = new P3PrimeFinder001();
  }

  @Test
  public void test104395303isPrime() {
    boolean result = p3PrimeFinder001.isPrime(104395303D);
    assertThat(result, is(true));
  }
}
