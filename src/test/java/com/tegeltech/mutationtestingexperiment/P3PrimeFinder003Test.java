package com.tegeltech.mutationtestingexperiment;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P3PrimeFinder003Test {
  private P3PrimeFinder003 p3PrimeFinder003;

  @Before
  public void setUp() {
    p3PrimeFinder003 = new P3PrimeFinder003();
  }

  @Test
  public void test104395303isPrime() {
    boolean result = p3PrimeFinder003.isPrime(104395303D);
    assertThat(result, is(true));
  }
}
