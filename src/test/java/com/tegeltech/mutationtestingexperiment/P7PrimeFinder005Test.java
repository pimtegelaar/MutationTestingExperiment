package com.tegeltech.mutationtestingexperiment;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P7PrimeFinder005Test {
  private P7PrimeFinder005 p7PrimeFinder005;

  @Before
  public void setUp() {
    p7PrimeFinder005 = new P7PrimeFinder005();
  }

  @Test
  public void test104395303isPrime() {
    boolean result = p7PrimeFinder005.isPrime(104395303D);
    assertThat(result, is(true));
  }
}
