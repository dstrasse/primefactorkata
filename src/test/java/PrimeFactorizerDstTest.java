/**
 * Copyright (c) 2011 CoreMedia AG, Hamburg. All rights reserved.
 */

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static com.coremedia.PrimeFactorizerDst.getPrimes;
import static org.junit.Assert.assertArrayEquals;

/**
 * Tests.
 */
@RunWith(Parameterized.class)
public class PrimeFactorizerDstTest {

  private Long number;
  private Long[] primes;

  public PrimeFactorizerDstTest(Long number, Long[] primes) {
    this.number = number;
    this.primes = primes;
  }

  @Test
  public void testGetPrimes() throws Exception {
    assertArrayEquals(primes, getPrimes(number).toArray());
  }

  @Parameterized.Parameters
  public static Collection data() {
    return Arrays.asList(new Object[][]{
            {2L, new Long[]{2L}},
            {3L, new Long[]{3L}},
            {4L, new Long[]{2L, 2L}},
            {5L, new Long[]{5L}},
            {6L, new Long[]{2L, 3L}},
            {7L, new Long[]{7L}},
            {8L, new Long[]{2L, 2L, 2L}},
            {11L, new Long[]{11L}},
            {1983L, new Long[]{3L, 661L}},
    });
  }
}
