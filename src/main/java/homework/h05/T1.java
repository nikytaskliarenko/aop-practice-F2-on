package homework.h05;

// base
// https://leetcode.com/problems/longest-common-prefix/
public class T1 {
  public int maxProductDifference(int[] nums) {
    int max1 = 0;
    int max2 = 0;
    int min1 = Integer.MAX_VALUE;
    int min2 = Integer.MAX_VALUE;

    for (int x : nums) {
      if (x > Math.min(max1, max2)) {
        max2 = Math.max(max1, max2);
        max1 = x;
      }
      if (x < Math.max(min1, min2)) {
        min2 = Math.min(min1, min2);
        min1 = x;
      }
    }
    return max1 * max2 - min1 * min2;
  }
}
