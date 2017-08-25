package com.tegeltech.mutationtestingexperiment;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P9PrimeFinder001Test {
  private P9PrimeFinder001 p9PrimeFinder001;

  @Before
  public void setUp() {
    p9PrimeFinder001 = new P9PrimeFinder001();
  }

  @Test
  public void test104395303isPrime() {
    boolean result = p9PrimeFinder001.isPrime(104395303D);
    assertThat(result, is(true));
  }
}
