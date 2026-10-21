package homework.h06;

// base
// https://leetcode.com/problems/valid-anagram/
public class T1 {
  public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) return false;

    int[] countS = new int['z' - 'a' + 1];
    int[] countT = new int['z' - 'a' + 1];

    for (int i = 0; i < s.length(); i++) {
      countS[s.charAt(i) - 'a']++;
      countT[t.charAt(i) - 'a']++;
    }
    for (int i = 0; i < countS.length; i++) {
      if (countS[i] != countT[i]) return false;
    }
    return true;
  }
}
