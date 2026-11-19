package homework.h05;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T1Test {
  private final T1 task1 = new T1();

  @Test
  void unsorted() {
    int[] input = new int[] {5, 6, 2, 7, 4};
    var actual = task1.maxProductDifference(input);

    assertThat(actual).isEqualTo(34);
  }

  @Test
  void withDuplicates() {
    int[] input = new int[] {4, 2, 5, 9, 7, 4, 8};
    var actual = task1.maxProductDifference(input);

    assertThat(actual).isEqualTo(64);
  }

  @Test
  void ascending() {
    int[] input = new int[] {1, 2, 3, 4, 5};
    var actual = task1.maxProductDifference(input);

    assertThat(actual).isEqualTo(18);
  }

  @Test
  void descending() {
    int[] input = new int[] {5, 4, 3, 2, 1};
    var actual = task1.maxProductDifference(input);

    assertThat(actual).isEqualTo(18);
  }

  @Test
  void allEqual() {
    int[] input = new int[] {3, 3, 3, 3};
    var actual = task1.maxProductDifference(input);

    assertThat(actual).isZero();
  }

  @Test
  void minValues() {
    int[] input = new int[] {1, 1, 1, 1};
    var actual = task1.maxProductDifference(input);

    assertThat(actual).isZero();
  }

  @Test
  void maxValues() {
    int[] input = new int[] {10_000, 10_000, 10_000, 10_000};
    var actual = task1.maxProductDifference(input);

    assertThat(actual).isZero();
  }

  @Test
  void minAndMaxValues() {
    int[] input = new int[] {10_000, 1, 10_000, 1};
    var actual = task1.maxProductDifference(input);

    assertThat(actual).isEqualTo(99_999_999);
  }

  @Test
  void maxLength() {
    int[] input = new int[10_000];
    for (int i = 0; i < input.length; i++) {
      input[i] = i + 1;
    }
    var actual = task1.maxProductDifference(input);

    assertThat(actual).isEqualTo(99_989_998);
  }
}
