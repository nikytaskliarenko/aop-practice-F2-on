package homework.h16;

// advanced
// https://leetcode.com/problems/find-the-town-judge/
public class T2 {
  public int findJudge(int n, int[][] trust) {
    int[] count = new int[n + 1];
    for (int i = 0; i < trust.length; i++) {
      count[trust[i][1]]++;
      count[trust[i][0]]--;
    }

    for (int i = 1; i < count.length; i++) {
      if (count[i] == n - 1) {
        return i;
      }
    }
    return -1;
  }
}
