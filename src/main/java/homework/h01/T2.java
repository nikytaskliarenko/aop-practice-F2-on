package homework.h01;

// advanced
// https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/
public class T2 {
  public int countOdds(int low, int high) {
    if (low % 2 == 1 || high % 2 == 1) {
      return (high - low) / 2 + 1;
    }
    return (high - low) / 2;
  }
}
