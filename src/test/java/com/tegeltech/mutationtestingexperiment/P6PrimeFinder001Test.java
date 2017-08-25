package com.tegeltech.mutationtestingexperiment;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P6PrimeFinder001Test {
  private P6PrimeFinder001 p6PrimeFinder001;

  @Before
  public void setUp() {
    p6PrimeFinder001 = new P6PrimeFinder001();
  }

  @Test
  public void test104395303isPrime() {
    boolean result = p6PrimeFinder001.isPrime(104395303D);
    assertThat(result, is(true));
  }
}
