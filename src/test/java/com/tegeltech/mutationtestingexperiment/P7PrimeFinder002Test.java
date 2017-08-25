package com.tegeltech.mutationtestingexperiment;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P7PrimeFinder002Test {
  private P7PrimeFinder002 p7PrimeFinder002;

  @Before
  public void setUp() {
    p7PrimeFinder002 = new P7PrimeFinder002();
  }

  @Test
  public void test104395303isPrime() {
    boolean result = p7PrimeFinder002.isPrime(104395303D);
    assertThat(result, is(true));
  }
}
