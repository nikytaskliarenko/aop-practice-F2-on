package homework.h13;

// advanced
// https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/
public class T2 {
  public int maximumCount(int[] nums) {
    int neg = 0;
    int pos = 0;

    int low = 0;
    int high = nums.length;
    while (low < high) {
      int mid = low + (high - low) / 2;
      if (nums[mid] >= 0) {
        high = mid;
      } else {
        low = mid + 1;
      }
    }
    pos = low;

    low = 0;
    high = nums.length;

    while (low < high) {
      int mid = low + (high - low) / 2;
      if (nums[mid] >= 1) {
        high = mid;
      } else {
        low = mid + 1;
      }
    }
    neg = nums.length - low;

    return Math.max(pos, neg);
  }
}
