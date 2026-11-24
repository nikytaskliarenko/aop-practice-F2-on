package homework.h13;

// base
// https://leetcode.com/problems/first-bad-version/
public class T1 extends VersionControl {
  public T1(int bad) {
    super(bad);
  }

  public int firstBadVersion(int n) {
    int low = 0;
    int high = n;
    while (low < high) {
      int mid = low + (high - low) / 2;
      if (isBadVersion(mid)) {
        high = mid;
      } else {
        low = mid + 1;
      }
    }
    return low;
  }
}
