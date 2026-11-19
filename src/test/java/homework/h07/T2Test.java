package homework.h07;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T2Test {
  private final T2 task2 = new T2();

  @Test
  void evenNumber() {
    int num = 14;
    var actual = task2.numberOfSteps(num);

    assertThat(actual).isEqualTo(6);
  }

  @Test
  void oddNumber() {
    int num = 123;
    var actual = task2.numberOfSteps(num);

    assertThat(actual).isEqualTo(12);
  }

  @Test
  void minNum() {
    int num = 0;
    var actual = task2.numberOfSteps(num);

    assertThat(actual).isZero();
  }

  @Test
  void one() {
    int num = 1;
    var actual = task2.numberOfSteps(num);

    assertThat(actual).isEqualTo(1);
  }

  @Test
  void maxNum() {
    int num = 1_000_000;
    var actual = task2.numberOfSteps(num);

    assertThat(actual).isEqualTo(26);
  }

  @Test
  void mostStepsInRange() {
    int num = 983_039;
    var actual = task2.numberOfSteps(num);

    assertThat(actual).isEqualTo(38);
  }
}
