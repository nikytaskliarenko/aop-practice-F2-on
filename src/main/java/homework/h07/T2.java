package homework.h07;

// advanced
// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
public class T2 {
  public int numberOfSteps(int num) {
    int steps = 0;
    while (num != 0) {
      steps++;
      if (num % 2 == 0) {
        num /= 2;
      } else num--;
    }
    return steps;
  }
}
