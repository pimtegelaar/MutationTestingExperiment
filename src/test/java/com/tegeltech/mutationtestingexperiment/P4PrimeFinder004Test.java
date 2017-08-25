package com.tegeltech.mutationtestingexperiment;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P4PrimeFinder004Test {
  private P4PrimeFinder004 p4PrimeFinder004;

  @Before
  public void setUp() {
    p4PrimeFinder004 = new P4PrimeFinder004();
  }

  @Test
  public void test104395303isPrime() {
    boolean result = p4PrimeFinder004.isPrime(104395303D);
    assertThat(result, is(true));
  }
}
