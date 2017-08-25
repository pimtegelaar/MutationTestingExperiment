package com.tegeltech.mutationtestingexperiment;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P7PrimeFinder007Test {
  private P7PrimeFinder007 p7PrimeFinder007;

  @Before
  public void setUp() {
    p7PrimeFinder007 = new P7PrimeFinder007();
  }

  @Test
  public void test104395303isPrime() {
    boolean result = p7PrimeFinder007.isPrime(104395303D);
    assertThat(result, is(true));
  }
}
