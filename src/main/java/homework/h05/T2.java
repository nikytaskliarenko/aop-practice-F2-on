package homework.h05;

import java.util.Arrays;

// advanced
// https://leetcode.com/problems/rotate-image/
public class T2 {
  public int[] sortedSquares(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      nums[i] = nums[i] * nums[i];
    }
    Arrays.sort(nums);
    return nums;
  }
}
