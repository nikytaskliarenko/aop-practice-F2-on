package homework.h02;

// advanced
// https://leetcode.com/problems/a-number-after-a-double-reversal/
public class T2 {
  public boolean isSameAfterReversals(int num) {
    return num == 0 || num % 10 != 0;
  }
}
