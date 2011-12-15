package com.coremedia; /**
 * Copyright (c) 2011 CoreMedia AG, Hamburg. All rights reserved.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * The PrimeFactorizer.
 */
public class PrimeFactorizerDst {

  public static List<Long> getPrimes(Long number) {
    if (number > 1) {
      List<Long> primes = new ArrayList<Long>();
      Long counter = 2L;
      while (number > 1) {
        while (number % counter == 0) {
          primes.add(counter);
          number /= counter;
        }
        counter++;
      }
      return primes;
    } else {
      return new ArrayList<Long>(0);
    }
  }
}
