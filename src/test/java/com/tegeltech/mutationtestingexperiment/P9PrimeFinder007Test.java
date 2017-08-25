package com.tegeltech.mutationtestingexperiment;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P9PrimeFinder007Test {
  private P9PrimeFinder007 p9PrimeFinder007;

  @Before
  public void setUp() {
    p9PrimeFinder007 = new P9PrimeFinder007();
  }

  @Test
  public void test104395303isPrime() {
    boolean result = p9PrimeFinder007.isPrime(104395303D);
    assertThat(result, is(true));
  }
}
