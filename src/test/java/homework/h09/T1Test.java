package homework.h09;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class T1Test {
  private final T1 task1 = new T1();

  @Test
  void allEqualGivesAllPairs() {
    for (int n = 1; n <= 100; n++) {
      int[] nums = new int[n];
      Arrays.fill(nums, 7);
      assertThat(task1.numIdenticalPairs(nums)).isEqualTo(n * (n - 1) / 2);
    }
  }

  @Test
  void allDistinct() {
    assertThat(task1.numIdenticalPairs(new int[] {1, 2, 3})).isZero();
  }

  @Test
  void singleElement() {
    assertThat(task1.numIdenticalPairs(new int[] {5})).isZero();
  }

  @Test
  void twoEqualElements() {
    assertThat(task1.numIdenticalPairs(new int[] {2, 2})).isEqualTo(1);
  }

  @Test
  void mixedValues() {
    assertThat(task1.numIdenticalPairs(new int[] {1, 2, 3, 1, 1, 3})).isEqualTo(4);
  }

  @Test
  void pairAtFirstAndLast() {
    assertThat(task1.numIdenticalPairs(new int[] {5, 1, 2, 5})).isEqualTo(1);
  }

  @Test
  void minAndMaxValues() {
    assertThat(task1.numIdenticalPairs(new int[] {1, 100, 1, 100})).isEqualTo(2);
  }

  @Test
  void maxLengthAllDistinct() {
    int[] nums = new int[100];
    for (int i = 0; i < nums.length; i++) {
      nums[i] = i + 1;
    }
    assertThat(task1.numIdenticalPairs(nums)).isZero();
  }
}
