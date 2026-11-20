package homework.h12;

// advanced
// https://leetcode.com/problems/relative-sort-array/
public class T2 {
  public int[] relativeSortArray(int[] arr1, int[] arr2) {
    int[] count = new int[1001];
    for (int x : arr1) {
      count[x]++;
    }

    int[] result = new int[arr1.length];
    int i = 0;

    for (int x : arr2) {
      for (int k = 0; k < count[x]; k++) {
        result[i++] = x;
      }
      count[x] = 0;
    }

    for (int x = 0; x <= 1000; x++) {
      for (int k = 0; k < count[x]; k++) {
        result[i++] = x;
      }
    }

    return result;
  }
}
