package homework.h03;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T2Test {
  private final T2 task2 = new T2();

  @Test
  void noneDivisible() {
    int n = 5;
    int m = 6;
    var actual = task2.differenceOfSums(n, m);

    assertThat(actual).isEqualTo(15);
  }

  @Test
  void allDivisible() {
    int n = 5;
    int m = 1;
    var actual = task2.differenceOfSums(n, m);

    assertThat(actual).isEqualTo(-15);
  }

  @Test
  void onlyLastDivisible() {
    int n = 5;
    int m = 5;
    var actual = task2.differenceOfSums(n, m);

    assertThat(actual).isEqualTo(5);
  }

  @Test
  void minValues() {
    int n = 1;
    int m = 1;
    var actual = task2.differenceOfSums(n, m);

    assertThat(actual).isEqualTo(-1);
  }

  @Test
  void minNMaxM() {
    int n = 1;
    int m = 1000;
    var actual = task2.differenceOfSums(n, m);

    assertThat(actual).isEqualTo(1);
  }

  @Test
  void maxNMinM() {
    int n = 1000;
    int m = 1;
    var actual = task2.differenceOfSums(n, m);

    assertThat(actual).isEqualTo(-500_500);
  }

  @Test
  void maxValues() {
    int n = 1000;
    int m = 1000;
    var actual = task2.differenceOfSums(n, m);

    assertThat(actual).isEqualTo(498_500);
  }
}
