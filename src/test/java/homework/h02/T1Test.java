package homework.h02;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T1Test {
  private final T1 task1 = new T1();

  @Test
  void singleDigitStaysSame() {
    for (int num = 1; num <= 9; num++) {
      var actual = task1.addDigits(num);

      assertThat(actual).isEqualTo(num);
    }
  }

  @Test
  void twoSteps() {
    int num = 38;
    var actual = task1.addDigits(num);

    assertThat(actual).isEqualTo(2);
  }

  @Test
  void minNum() {
    int num = 0;
    var actual = task1.addDigits(num);

    assertThat(actual).isZero();
  }

  @Test
  void maxNum() {
    int num = Integer.MAX_VALUE;
    var actual = task1.addDigits(num);

    assertThat(actual).isEqualTo(1);
  }
}
