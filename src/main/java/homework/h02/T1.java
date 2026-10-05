package homework.h02;

// base
// https://leetcode.com/problems/add-digits/
public class T1 {
  public int addDigits(int num) {
    return ((num - 1) % 9) + 1;
  }
}
