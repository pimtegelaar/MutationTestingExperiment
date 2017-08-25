package com.tegeltech.mutationtestingexperiment;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P9PrimeFinder003Test {
  private P9PrimeFinder003 p9PrimeFinder003;

  @Before
  public void setUp() {
    p9PrimeFinder003 = new P9PrimeFinder003();
  }

  @Test
  public void test104395303isPrime() {
    boolean result = p9PrimeFinder003.isPrime(104395303D);
    assertThat(result, is(true));
  }
}
