package com.tegeltech.mutationtestingexperiment;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P9PrimeFinder006Test {
  private P9PrimeFinder006 p9PrimeFinder006;

  @Before
  public void setUp() {
    p9PrimeFinder006 = new P9PrimeFinder006();
  }

  @Test
  public void test104395303isPrime() {
    boolean result = p9PrimeFinder006.isPrime(104395303D);
    assertThat(result, is(true));
  }
}
