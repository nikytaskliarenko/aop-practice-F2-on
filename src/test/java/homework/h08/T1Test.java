package homework.h08;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class T1Test {
  private final T1 task1 = new T1();

  @Test
  void longestAtEnd() {
    int[] input = new int[] {1, 1, 0, 1, 1, 1};
    var actual = task1.findMaxConsecutiveOnes(input);

    assertThat(actual).isEqualTo(3);
  }

  @Test
  void longestAtStart() {
    int[] input = new int[] {1, 1, 1, 0, 1, 1};
    var actual = task1.findMaxConsecutiveOnes(input);

    assertThat(actual).isEqualTo(3);
  }

  @Test
  void longestInMiddle() {
    int[] input = new int[] {1, 0, 1, 1, 0, 1};
    var actual = task1.findMaxConsecutiveOnes(input);

    assertThat(actual).isEqualTo(2);
  }

  @Test
  void allZeros() {
    int[] input = new int[] {0, 0, 0};
    var actual = task1.findMaxConsecutiveOnes(input);

    assertThat(actual).isZero();
  }

  @Test
  void singleZero() {
    int[] input = new int[] {0};
    var actual = task1.findMaxConsecutiveOnes(input);

    assertThat(actual).isZero();
  }

  @Test
  void singleOne() {
    int[] input = new int[] {1};
    var actual = task1.findMaxConsecutiveOnes(input);

    assertThat(actual).isEqualTo(1);
  }

  @Test
  void maxLengthAllOnes() {
    int[] input = new int[100_000];
    Arrays.fill(input, 1);
    var actual = task1.findMaxConsecutiveOnes(input);

    assertThat(actual).isEqualTo(100_000);
  }

  @Test
  void maxLengthAllZeros() {
    int[] input = new int[100_000];
    var actual = task1.findMaxConsecutiveOnes(input);

    assertThat(actual).isZero();
  }
}
