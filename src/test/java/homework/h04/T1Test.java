package homework.h04;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T1Test {
  private final T1 task1 = new T1();

  @Test
  void equalNumbers() {
    int x = 4242;
    int y = 4242;
    var actual = task1.hammingDistance(x, y);

    assertThat(actual).isZero();
  }

  @Test
  void minValues() {
    int x = 0;
    int y = 0;
    var actual = task1.hammingDistance(x, y);

    assertThat(actual).isZero();
  }

  @Test
  void maxValues() {
    int x = Integer.MAX_VALUE;
    int y = Integer.MAX_VALUE;
    var actual = task1.hammingDistance(x, y);

    assertThat(actual).isZero();
  }

  @Test
  void minAndMax() {
    int x = 0;
    int y = Integer.MAX_VALUE;
    var actual = task1.hammingDistance(x, y);

    assertThat(actual).isEqualTo(31);
  }
}
