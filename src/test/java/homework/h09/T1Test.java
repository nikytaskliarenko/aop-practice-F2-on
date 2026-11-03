package homework.h09;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class T1Test {
  private final T1 task1 = new T1();

  @Test
  void allEqualGivesAllPairs() {
    for (int n = 1; n <= 100; n++) {
      int[] input = new int[n];
      Arrays.fill(input, 7);
      var actual = task1.numIdenticalPairs(input);

      assertThat(actual).isEqualTo(n * (n - 1) / 2);
    }
  }

  @Test
  void allDistinct() {
    int[] input = new int[] {1, 2, 3};
    var actual = task1.numIdenticalPairs(input);

    assertThat(actual).isZero();
  }

  @Test
  void singleElement() {
    int[] input = new int[] {5};
    var actual = task1.numIdenticalPairs(input);

    assertThat(actual).isZero();
  }

  @Test
  void twoEqualElements() {
    int[] input = new int[] {2, 2};
    var actual = task1.numIdenticalPairs(input);

    assertThat(actual).isEqualTo(1);
  }

  @Test
  void mixedValues() {
    int[] input = new int[] {1, 2, 3, 1, 1, 3};
    var actual = task1.numIdenticalPairs(input);

    assertThat(actual).isEqualTo(4);
  }

  @Test
  void pairAtFirstAndLast() {
    int[] input = new int[] {5, 1, 2, 5};
    var actual = task1.numIdenticalPairs(input);

    assertThat(actual).isEqualTo(1);
  }

  @Test
  void minAndMaxValues() {
    int[] input = new int[] {1, 100, 1, 100};
    var actual = task1.numIdenticalPairs(input);

    assertThat(actual).isEqualTo(2);
  }

  @Test
  void maxLengthAllDistinct() {
    int[] input = new int[100];
    for (int i = 0; i < input.length; i++) {
      input[i] = i + 1;
    }
    var actual = task1.numIdenticalPairs(input);

    assertThat(actual).isZero();
  }
}
