package homework.h04;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T2Test {
  private final T2 task2 = new T2();

  @Test
  void minNum() {
    int num = 1;
    var actual = task2.findComplement(num);

    assertThat(actual).isZero();
  }

  @Test
  void allOnes() {
    int num = 7;
    var actual = task2.findComplement(num);

    assertThat(actual).isZero();
  }

  @Test
  void maxNum() {
    int num = Integer.MAX_VALUE;
    var actual = task2.findComplement(num);

    assertThat(actual).isZero();
  }

  @Test
  void maxEvenNum() {
    int num = Integer.MAX_VALUE - 1;
    var actual = task2.findComplement(num);

    assertThat(actual).isEqualTo(1);
  }
}
