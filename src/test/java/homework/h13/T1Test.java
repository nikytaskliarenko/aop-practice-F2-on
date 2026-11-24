package homework.h13;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T1Test {
  @Test
  void badInMiddle() {
    var task1 = new T1(4);
    var actual = task1.firstBadVersion(5);

    assertThat(actual).isEqualTo(4);
  }

  @Test
  void oneBadVersion() {
    var task1 = new T1(1);
    var actual = task1.firstBadVersion(1);

    assertThat(actual).isEqualTo(1);
  }

  @Test
  void firstIsBad() {
    var task1 = new T1(1);
    var actual = task1.firstBadVersion(10);

    assertThat(actual).isEqualTo(1);
  }

  @Test
  void lastIsBad() {
    var task1 = new T1(10);
    var actual = task1.firstBadVersion(10);

    assertThat(actual).isEqualTo(10);
  }

  @Test
  void maxN() {
    var task1 = new T1(1_702_766_719);
    var actual = task1.firstBadVersion(Integer.MAX_VALUE);

    assertThat(actual).isEqualTo(1_702_766_719);
  }
}
