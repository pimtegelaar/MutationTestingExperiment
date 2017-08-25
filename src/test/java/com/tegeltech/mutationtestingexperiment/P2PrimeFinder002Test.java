package com.tegeltech.mutationtestingexperiment;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P2PrimeFinder002Test {
  private P2PrimeFinder002 p2PrimeFinder002;

  @Before
  public void setUp() {
    p2PrimeFinder002 = new P2PrimeFinder002();
  }

  @Test
  public void test104395303isPrime() {
    boolean result = p2PrimeFinder002.isPrime(104395303D);
    assertThat(result, is(true));
  }
}
