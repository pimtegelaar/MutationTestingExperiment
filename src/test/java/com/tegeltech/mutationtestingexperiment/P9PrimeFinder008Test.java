package com.tegeltech.mutationtestingexperiment;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P9PrimeFinder008Test {
  private P9PrimeFinder008 p9PrimeFinder008;

  @Before
  public void setUp() {
    p9PrimeFinder008 = new P9PrimeFinder008();
  }

  @Test
  public void test104395303isPrime() {
    boolean result = p9PrimeFinder008.isPrime(104395303D);
    assertThat(result, is(true));
  }
}
