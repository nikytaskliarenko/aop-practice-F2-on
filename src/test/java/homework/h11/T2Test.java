package homework.h11;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class T2Test {
  private final T2 task2 = new T2();

  @Test
  void shortArray() {
    int[] input = new int[] {3, 2, 3};
    var actual = task2.majorityElement(input);

    assertThat(actual).isEqualTo(3);
  }

  @Test
  void mixedOrder() {
    int[] input = new int[] {2, 2, 1, 1, 1, 2, 2};
    var actual = task2.majorityElement(input);

    assertThat(actual).isEqualTo(2);
  }

  @Test
  void singleElement() {
    int[] input = new int[] {5};
    var actual = task2.majorityElement(input);

    assertThat(actual).isEqualTo(5);
  }

  @Test
  void allEqual() {
    int[] input = new int[] {7, 7, 7, 7};
    var actual = task2.majorityElement(input);

    assertThat(actual).isEqualTo(7);
  }

  @Test
  void minAndMaxValues() {
    int[] input = new int[] {-1_000_000_000, 1_000_000_000, 1_000_000_000};
    var actual = task2.majorityElement(input);

    assertThat(actual).isEqualTo(1_000_000_000);
  }

  @Test
  void maxLength() {
    int[] input = new int[50_000];
    Arrays.fill(input, 7);
    for (int i = 0; i < 24_999; i++) {
      input[i] = i + 100;
    }
    var actual = task2.majorityElement(input);

    assertThat(actual).isEqualTo(7);
  }
}
