package homework.h08;

// base
// https://leetcode.com/problems/max-consecutive-ones/
public class T1 {
  public int findMaxConsecutiveOnes(int[] nums) {
    int result = 0;
    int count = 0;
    for (int num : nums) {
      if (num == 1) {
        count++;
        result = Math.max(result, count);
      } else {
        count = 0;
      }
    }
    return result;
  }
}
