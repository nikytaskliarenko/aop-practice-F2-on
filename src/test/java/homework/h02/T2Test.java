package homework.h02;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T2Test {
  private final T2 task2 = new T2();

  @Test
  void noTrailingZero() {
    int num = 526;
    var actual = task2.isSameAfterReversals(num);

    assertThat(actual).isTrue();
  }

  @Test
  void trailingZeros() {
    int num = 1800;
    var actual = task2.isSameAfterReversals(num);

    assertThat(actual).isFalse();
  }

  @Test
  void zeroInMiddle() {
    int num = 101;
    var actual = task2.isSameAfterReversals(num);

    assertThat(actual).isTrue();
  }

  @Test
  void minNum() {
    int num = 0;
    var actual = task2.isSameAfterReversals(num);

    assertThat(actual).isTrue();
  }

  @Test
  void singleDigit() {
    int num = 1;
    var actual = task2.isSameAfterReversals(num);

    assertThat(actual).isTrue();
  }

  @Test
  void maxNum() {
    int num = 1_000_000;
    var actual = task2.isSameAfterReversals(num);

    assertThat(actual).isFalse();
  }

  @Test
  void largestWithoutTrailingZero() {
    int num = 999_999;
    var actual = task2.isSameAfterReversals(num);

    assertThat(actual).isTrue();
  }
}
