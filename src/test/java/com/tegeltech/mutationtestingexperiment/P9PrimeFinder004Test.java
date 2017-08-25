package com.tegeltech.mutationtestingexperiment;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P9PrimeFinder004Test {
  private P9PrimeFinder004 p9PrimeFinder004;

  @Before
  public void setUp() {
    p9PrimeFinder004 = new P9PrimeFinder004();
  }

  @Test
  public void test104395303isPrime() {
    boolean result = p9PrimeFinder004.isPrime(104395303D);
    assertThat(result, is(true));
  }
}
