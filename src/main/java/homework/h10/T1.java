package homework.h10;

// base
// https://leetcode.com/problems/find-the-k-th-character-in-string-game-i/
public class T1 {
  public char kthCharacter(int k) {
    return grow(new StringBuilder("a"), k).charAt(k - 1);
  }

  static StringBuilder grow(StringBuilder s, int k) {
    if (s.length() >= k) return s;

    int len = s.length();
    for (int i = 0; i < len; i++) {
      s.append((char) (s.charAt(i) + 1));
    }
    return grow(s, k);
  }
}
