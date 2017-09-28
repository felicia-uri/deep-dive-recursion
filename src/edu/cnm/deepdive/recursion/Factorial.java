package edu.cnm.deepdive.recursion;

import java.math.BigInteger;

public class Factorial {

  public static BigInteger factorial(int n) {
    return (n<= 1)
        ? BigInteger.ONE 
            : factorial(n - 1).multiply(BigInteger.valueOf(n));
  }
}
