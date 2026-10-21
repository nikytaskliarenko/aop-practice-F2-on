package homework.h06;

// advanced
// https://leetcode.com/problems/valid-palindrome/
public class T2 {
  public boolean isPalindrome(String s) {
    String clean = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
    for (int i = 0; i < (clean.length() / 2); i++) {
      if (clean.charAt(i) != clean.charAt(clean.length() - 1 - i)) {
        return false;
      }
    }
    return true;
  }
}
