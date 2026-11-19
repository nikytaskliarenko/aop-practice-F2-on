package homework.h11;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T1Test {
  private final T1 task1 = new T1();

  @Test
  void missingInMiddle() {
    int[] input = new int[] {3, 0, 1};
    var actual = task1.missingNumber(input);

    assertThat(actual).isEqualTo(2);
  }

  @Test
  void missingLast() {
    int[] input = new int[] {0, 1};
    var actual = task1.missingNumber(input);

    assertThat(actual).isEqualTo(2);
  }

  @Test
  void missingZero() {
    int[] input = new int[] {2, 1, 3};
    var actual = task1.missingNumber(input);

    assertThat(actual).isZero();
  }

  @Test
  void singleZero() {
    int[] input = new int[] {0};
    var actual = task1.missingNumber(input);

    assertThat(actual).isEqualTo(1);
  }

  @Test
  void singleOne() {
    int[] input = new int[] {1};
    var actual = task1.missingNumber(input);

    assertThat(actual).isZero();
  }

  @Test
  void maxLength() {
    int[] input = new int[10_000];
    for (int i = 0; i < input.length; i++) {
      input[i] = i + 1;
    }
    var actual = task1.missingNumber(input);

    assertThat(actual).isZero();
  }
}
