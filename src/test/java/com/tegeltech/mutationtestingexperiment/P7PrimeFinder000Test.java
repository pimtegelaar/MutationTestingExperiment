package com.tegeltech.mutationtestingexperiment;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P7PrimeFinder000Test {
  private P7PrimeFinder000 p7PrimeFinder000;

  @Before
  public void setUp() {
    p7PrimeFinder000 = new P7PrimeFinder000();
  }

  @Test
  public void test104395303isPrime() {
    boolean result = p7PrimeFinder000.isPrime(104395303D);
    assertThat(result, is(true));
  }
}
