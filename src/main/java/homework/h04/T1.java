package homework.h04;

// base
// https://leetcode.com/problems/hamming-distance/
public class T1 {
  public int hammingDistance(int x, int y) {
    int dist = 0;
    for (int val = x ^ y; val > 0; ++dist) {
      val = val & (val - 1);
    }
    return dist;
  }
}
