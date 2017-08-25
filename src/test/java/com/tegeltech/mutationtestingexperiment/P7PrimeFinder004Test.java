package com.tegeltech.mutationtestingexperiment;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P7PrimeFinder004Test {
  private P7PrimeFinder004 p7PrimeFinder004;

  @Before
  public void setUp() {
    p7PrimeFinder004 = new P7PrimeFinder004();
  }

  @Test
  public void test104395303isPrime() {
    boolean result = p7PrimeFinder004.isPrime(104395303D);
    assertThat(result, is(true));
  }
}
