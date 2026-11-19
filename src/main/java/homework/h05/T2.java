package homework.h05;

import java.util.Arrays;

// advanced
// https://leetcode.com/problems/squares-of-a-sorted-array/description/
public class T2 {
  public int[] sortedSquares(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      nums[i] = nums[i] * nums[i];
    }
    Arrays.sort(nums);
    return nums;
  }
}
