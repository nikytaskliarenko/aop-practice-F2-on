package homework.h01;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T1Test {
  private final T1 task1 = new T1();

  @Test
  void evenReturnsItself() {
    int n = 6;
    var actual = task1.smallestEvenMultiple(n);

    assertThat(actual).isEqualTo(6);
  }

  @Test
  void oddReturnsDoubled() {
    int n = 5;
    var actual = task1.smallestEvenMultiple(n);

    assertThat(actual).isEqualTo(10);
  }

  @Test
  void minN() {
    int n = 1;
    var actual = task1.smallestEvenMultiple(n);

    assertThat(actual).isEqualTo(2);
  }

  @Test
  void maxN() {
    int n = 150;
    var actual = task1.smallestEvenMultiple(n);

    assertThat(actual).isEqualTo(150);
  }

  @Test
  void maxOddN() {
    int n = 149;
    var actual = task1.smallestEvenMultiple(n);

    assertThat(actual).isEqualTo(298);
  }
}
