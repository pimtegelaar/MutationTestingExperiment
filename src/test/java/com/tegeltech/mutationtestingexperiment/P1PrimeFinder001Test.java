package com.tegeltech.mutationtestingexperiment;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P1PrimeFinder001Test {
  private P1PrimeFinder001 p1PrimeFinder001;

  @Before
  public void setUp() {
    p1PrimeFinder001 = new P1PrimeFinder001();
  }

  @Test
  public void test104395303isPrime() {
    boolean result = p1PrimeFinder001.isPrime(104395303D);
    assertThat(result, is(true));
  }
}
