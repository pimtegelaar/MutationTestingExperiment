package com.tegeltech.mutationtestingexperiment;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P7PrimeFinder003Test {
  private P7PrimeFinder003 p7PrimeFinder003;

  @Before
  public void setUp() {
    p7PrimeFinder003 = new P7PrimeFinder003();
  }

  @Test
  public void test104395303isPrime() {
    boolean result = p7PrimeFinder003.isPrime(104395303D);
    assertThat(result, is(true));
  }
}
