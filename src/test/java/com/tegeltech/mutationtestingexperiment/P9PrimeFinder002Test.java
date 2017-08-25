package com.tegeltech.mutationtestingexperiment;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P9PrimeFinder002Test {
  private P9PrimeFinder002 p9PrimeFinder002;

  @Before
  public void setUp() {
    p9PrimeFinder002 = new P9PrimeFinder002();
  }

  @Test
  public void test104395303isPrime() {
    boolean result = p9PrimeFinder002.isPrime(104395303D);
    assertThat(result, is(true));
  }
}
