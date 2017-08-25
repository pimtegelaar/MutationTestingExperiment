package com.tegeltech.mutationtestingexperiment;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P9PrimeFinder000Test {
  private P9PrimeFinder000 p9PrimeFinder000;

  @Before
  public void setUp() {
    p9PrimeFinder000 = new P9PrimeFinder000();
  }

  @Test
  public void test104395303isPrime() {
    boolean result = p9PrimeFinder000.isPrime(104395303D);
    assertThat(result, is(true));
  }
}
