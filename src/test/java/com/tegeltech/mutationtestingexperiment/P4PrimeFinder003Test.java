package com.tegeltech.mutationtestingexperiment;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P4PrimeFinder003Test {
  private P4PrimeFinder003 p4PrimeFinder003;

  @Before
  public void setUp() {
    p4PrimeFinder003 = new P4PrimeFinder003();
  }

  @Test
  public void test104395303isPrime() {
    boolean result = p4PrimeFinder003.isPrime(104395303D);
    assertThat(result, is(true));
  }
}
