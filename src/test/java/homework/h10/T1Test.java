package homework.h10;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T1Test {
  private final T1 task1 = new T1();

  @Test
  void firstCharacterNeedsNoGrowth() {
    int k = 1;
    var actual = task1.kthCharacter(k);

    assertThat(actual).isEqualTo('a');
  }

  @Test
  void secondCharacterNeedsOneGrowth() {
    int k = 2;
    var actual = task1.kthCharacter(k);

    assertThat(actual).isEqualTo('b');
  }

  @Test
  void exactlyPowerOfTwo() {
    int k = 8;
    var actual = task1.kthCharacter(k);

    assertThat(actual).isEqualTo('d');
  }

  @Test
  void mostShiftedLetter() {
    int k = 256;
    var actual = task1.kthCharacter(k);

    assertThat(actual).isEqualTo('i');
  }

  @Test
  void maxK() {
    int k = 500;
    var actual = task1.kthCharacter(k);

    assertThat(actual).isEqualTo('h');
  }

  @Test
  void repeatedCalls() {
    task1.kthCharacter(500);
    var actual = task1.kthCharacter(1);

    assertThat(actual).isEqualTo('a');
  }
}
