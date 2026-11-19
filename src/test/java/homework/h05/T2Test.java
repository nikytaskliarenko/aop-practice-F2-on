package homework.h05;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T2Test {
  private final T2 task2 = new T2();

  @Test
  void negativeAndPositive() {
    int[] input = new int[] {-4, -1, 0, 3, 10};
    var actual = task2.sortedSquares(input);

    assertThat(actual).containsExactly(0, 1, 9, 16, 100);
  }

  @Test
  void equalSquares() {
    int[] input = new int[] {-7, -3, 2, 3, 11};
    var actual = task2.sortedSquares(input);

    assertThat(actual).containsExactly(4, 9, 9, 49, 121);
  }

  @Test
  void allNegative() {
    int[] input = new int[] {-3, -2, -1};
    var actual = task2.sortedSquares(input);

    assertThat(actual).containsExactly(1, 4, 9);
  }

  @Test
  void allPositive() {
    int[] input = new int[] {1, 2, 3};
    var actual = task2.sortedSquares(input);

    assertThat(actual).containsExactly(1, 4, 9);
  }

  @Test
  void singleElement() {
    int[] input = new int[] {0};
    var actual = task2.sortedSquares(input);

    assertThat(actual).containsExactly(0);
  }

  @Test
  void minAndMaxValues() {
    int[] input = new int[] {-10_000, 0, 10_000};
    var actual = task2.sortedSquares(input);

    assertThat(actual).containsExactly(0, 100_000_000, 100_000_000);
  }

  @Test
  void maxLength() {
    int[] input = new int[10_000];
    for (int i = 0; i < input.length; i++) {
      input[i] = i - 5_000;
    }
    var actual = task2.sortedSquares(input);

    assertThat(actual).hasSize(10_000).isSorted();
    assertThat(actual[0]).isZero();
    assertThat(actual[actual.length - 1]).isEqualTo(25_000_000);
  }
}
