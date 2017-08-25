package com.tegeltech.mutationtestingexperiment;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P4PrimeFinder000Test {
  private P4PrimeFinder000 p4PrimeFinder000;

  @Before
  public void setUp() {
    p4PrimeFinder000 = new P4PrimeFinder000();
  }

  @Test
  public void test104395303isPrime() {
    boolean result = p4PrimeFinder000.isPrime(104395303D);
    assertThat(result, is(true));
  }
}
