package com.tegeltech.mutationtestingexperiment;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P8PrimeFinder003Test {
  private P8PrimeFinder003 p8PrimeFinder003;

  @Before
  public void setUp() {
    p8PrimeFinder003 = new P8PrimeFinder003();
  }

  @Test
  public void test104395303isPrime() {
    boolean result = p8PrimeFinder003.isPrime(104395303D);
    assertThat(result, is(true));
  }
}
