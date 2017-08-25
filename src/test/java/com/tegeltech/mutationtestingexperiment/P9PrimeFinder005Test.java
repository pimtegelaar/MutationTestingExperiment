package com.tegeltech.mutationtestingexperiment;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P9PrimeFinder005Test {
  private P9PrimeFinder005 p9PrimeFinder005;

  @Before
  public void setUp() {
    p9PrimeFinder005 = new P9PrimeFinder005();
  }

  @Test
  public void test104395303isPrime() {
    boolean result = p9PrimeFinder005.isPrime(104395303D);
    assertThat(result, is(true));
  }
}
