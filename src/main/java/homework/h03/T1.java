package homework.h03;

// base
// https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/
public class T1 {
  public double average(int[] salary) {
    int min = salary[0];
    int max = salary[0];
    int sum = 0;
    for (int i : salary) {
      sum += i;
      if (i < min) min = i;
      else if (i > max) max = i;
    }
    return (double) (sum - min - max) / (salary.length - 2);
  }
}
