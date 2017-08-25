package com.tegeltech.mutationtestingexperiment;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P9PrimeFinder009Test {
  private P9PrimeFinder009 p9PrimeFinder009;

  @Before
  public void setUp() {
    p9PrimeFinder009 = new P9PrimeFinder009();
  }

  @Test
  public void test104395303isPrime() {
    boolean result = p9PrimeFinder009.isPrime(104395303D);
    assertThat(result, is(true));
  }
}
