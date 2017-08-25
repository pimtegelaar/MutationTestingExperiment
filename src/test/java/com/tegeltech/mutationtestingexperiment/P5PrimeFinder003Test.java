package com.tegeltech.mutationtestingexperiment;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P5PrimeFinder003Test {
  private P5PrimeFinder003 p5PrimeFinder003;

  @Before
  public void setUp() {
    p5PrimeFinder003 = new P5PrimeFinder003();
  }

  @Test
  public void test104395303isPrime() {
    boolean result = p5PrimeFinder003.isPrime(104395303D);
    assertThat(result, is(true));
  }
}
