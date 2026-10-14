package homework.h04;

// advanced
// https://leetcode.com/problems/number-complement/
public class T2 {
  public int findComplement(int num) {
    int mask = 1;
    for (; mask < num; mask++) {
      mask *= 2;
    }
    return num ^ mask;
  }
}
