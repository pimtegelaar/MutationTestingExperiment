package com.tegeltech.mutationtestingexperiment;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P2PrimeFinder000Test {
  private P2PrimeFinder000 p2PrimeFinder000;

  @Before
  public void setUp() {
    p2PrimeFinder000 = new P2PrimeFinder000();
  }

  @Test
  public void test104395303isPrime() {
    boolean result = p2PrimeFinder000.isPrime(104395303D);
    assertThat(result, is(true));
  }
}
