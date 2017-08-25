package com.tegeltech.mutationtestingexperiment;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P2PrimeFinder001Test {
  private P2PrimeFinder001 p2PrimeFinder001;

  @Before
  public void setUp() {
    p2PrimeFinder001 = new P2PrimeFinder001();
  }

  @Test
  public void test104395303isPrime() {
    boolean result = p2PrimeFinder001.isPrime(104395303D);
    assertThat(result, is(true));
  }
}
