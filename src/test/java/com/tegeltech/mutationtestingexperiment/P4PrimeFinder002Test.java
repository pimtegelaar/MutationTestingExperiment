package com.tegeltech.mutationtestingexperiment;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P4PrimeFinder002Test {
  private P4PrimeFinder002 p4PrimeFinder002;

  @Before
  public void setUp() {
    p4PrimeFinder002 = new P4PrimeFinder002();
  }

  @Test
  public void test104395303isPrime() {
    boolean result = p4PrimeFinder002.isPrime(104395303D);
    assertThat(result, is(true));
  }
}
