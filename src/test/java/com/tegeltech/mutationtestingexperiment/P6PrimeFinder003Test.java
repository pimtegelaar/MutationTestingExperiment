package com.tegeltech.mutationtestingexperiment;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P6PrimeFinder003Test {
  private P6PrimeFinder003 p6PrimeFinder003;

  @Before
  public void setUp() {
    p6PrimeFinder003 = new P6PrimeFinder003();
  }

  @Test
  public void test104395303isPrime() {
    boolean result = p6PrimeFinder003.isPrime(104395303D);
    assertThat(result, is(true));
  }
}
