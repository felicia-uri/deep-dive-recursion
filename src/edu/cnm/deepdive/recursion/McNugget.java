package edu.cnm.deepdive.recursion;

public class McNugget {
  
  private static final int [] PACK_SIZES = {20, 9, 6};
  
  public static boolean test(int n) {
    if (n<0) {
      return false;
    }
      else if (n == 0) {
      return true;
      }
      else {
        return test(n, PACK_SIZES, 0);
      }
    }
  private static boolean test(int n, int[] packSizes, int offset) {
    if (n < 0) {
      return false;
    }
    if (n == 0) {
      return true;
    }
    boolean trial = false;
        for (int i = offset; i < packSizes.length; i++) {
          trial = test(n - packSizes[i], packSizes, i);
          if (trial) {
            break;
          }
        }
        return trial;
  }
  public static void main(String[] args ) {
    System.out.println(test(95, new int[] {15, 13,7, 5}, 0));
  }

}
