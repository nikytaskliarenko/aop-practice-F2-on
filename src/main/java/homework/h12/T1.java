package homework.h12;

import java.util.Arrays;

// base
// https://leetcode.com/problems/height-checker/
public class T1 {
  public int heightChecker(int[] heights) {
    int[] expected = heights.clone();
    Arrays.sort(expected);

    int count = 0;
    for (int i = 0; i < heights.length; i++) {
      if (heights[i] != expected[i]) count++;
    }
    return count;
  }
}
