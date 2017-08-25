package com.tegeltech.mutationtestingexperiment;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P4PrimeFinder001Test {
  private P4PrimeFinder001 p4PrimeFinder001;

  @Before
  public void setUp() {
    p4PrimeFinder001 = new P4PrimeFinder001();
  }

  @Test
  public void test104395303isPrime() {
    boolean result = p4PrimeFinder001.isPrime(104395303D);
    assertThat(result, is(true));
  }
}
