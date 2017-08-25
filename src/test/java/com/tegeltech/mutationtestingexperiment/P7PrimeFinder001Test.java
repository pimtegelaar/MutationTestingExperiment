package com.tegeltech.mutationtestingexperiment;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P7PrimeFinder001Test {
  private P7PrimeFinder001 p7PrimeFinder001;

  @Before
  public void setUp() {
    p7PrimeFinder001 = new P7PrimeFinder001();
  }

  @Test
  public void test104395303isPrime() {
    boolean result = p7PrimeFinder001.isPrime(104395303D);
    assertThat(result, is(true));
  }
}
