package com.tegeltech.mutationtestingexperiment;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P7PrimeFinder006Test {
  private P7PrimeFinder006 p7PrimeFinder006;

  @Before
  public void setUp() {
    p7PrimeFinder006 = new P7PrimeFinder006();
  }

  @Test
  public void test104395303isPrime() {
    boolean result = p7PrimeFinder006.isPrime(104395303D);
    assertThat(result, is(true));
  }
}
