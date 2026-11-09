package homework.h10;

// advanced
// https://leetcode.com/problems/reverse-string/
public class T2 {
  public void reverseString(char[] s) {
    char tmp;
    for (int i = 0; i < s.length / 2; i++) {
      tmp = s[i];
      s[i] = s[s.length - i - 1];
      s[s.length - i - 1] = tmp;
    }
  }
}
