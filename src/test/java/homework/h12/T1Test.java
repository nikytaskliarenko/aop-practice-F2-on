package homework.h12;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T1Test {
  private final T1 task1 = new T1();

  @Test
  void mixedOrder() {
    int[] input = new int[] {1, 1, 4, 2, 1, 3};
    var actual = task1.heightChecker(input);

    assertThat(actual).isEqualTo(3);
  }

  @Test
  void allMismatch() {
    int[] input = new int[] {5, 1, 2, 3, 4};
    var actual = task1.heightChecker(input);

    assertThat(actual).isEqualTo(5);
  }

  @Test
  void alreadySorted() {
    int[] input = new int[] {1, 2, 3, 4, 5};
    var actual = task1.heightChecker(input);

    assertThat(actual).isZero();
  }

  @Test
  void singleElement() {
    int[] input = new int[] {1};
    var actual = task1.heightChecker(input);

    assertThat(actual).isZero();
  }

  @Test
  void reversedMiddleMatches() {
    int[] input = new int[] {3, 2, 1};
    var actual = task1.heightChecker(input);

    assertThat(actual).isEqualTo(2);
  }

  @Test
  void maxLength() {
    int[] input = new int[100];
    for (int i = 0; i < input.length; i++) {
      input[i] = 100 - i;
    }
    var actual = task1.heightChecker(input);

    assertThat(actual).isEqualTo(100);
  }
}
