package homework.h11;

import java.util.Arrays;

// advanced
// https://leetcode.com/problems/majority-element/
public class T2 {
  public int majorityElement(int[] nums) {
    Arrays.sort(nums);
    return nums[nums.length / 2];
  }
}
