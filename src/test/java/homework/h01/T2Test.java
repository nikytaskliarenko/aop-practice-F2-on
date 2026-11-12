package homework.h01;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T2Test {
  private final T2 task2 = new T2();

  @Test
  void bothOdd() {
    int low = 3;
    int high = 7;
    var actual = task2.countOdds(low, high);

    assertThat(actual).isEqualTo(3);
  }

  @Test
  void bothEven() {
    int low = 8;
    int high = 10;
    var actual = task2.countOdds(low, high);

    assertThat(actual).isEqualTo(1);
  }

  @Test
  void lowOddHighEven() {
    int low = 3;
    int high = 8;
    var actual = task2.countOdds(low, high);

    assertThat(actual).isEqualTo(3);
  }

  @Test
  void lowEvenHighOdd() {
    int low = 4;
    int high = 9;
    var actual = task2.countOdds(low, high);

    assertThat(actual).isEqualTo(3);
  }

  @Test
  void sameEven() {
    int low = 6;
    int high = 6;
    var actual = task2.countOdds(low, high);

    assertThat(actual).isZero();
  }

  @Test
  void sameOdd() {
    int low = 7;
    int high = 7;
    var actual = task2.countOdds(low, high);

    assertThat(actual).isEqualTo(1);
  }

  @Test
  void minValues() {
    int low = 0;
    int high = 0;
    var actual = task2.countOdds(low, high);

    assertThat(actual).isZero();
  }

  @Test
  void maxValues() {
    int low = 1_000_000_000;
    int high = 1_000_000_000;
    var actual = task2.countOdds(low, high);

    assertThat(actual).isZero();
  }

  @Test
  void fullRange() {
    int low = 0;
    int high = 1_000_000_000;
    var actual = task2.countOdds(low, high);

    assertThat(actual).isEqualTo(500_000_000);
  }
}
