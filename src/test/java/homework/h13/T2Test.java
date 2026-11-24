package homework.h13;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T2Test {
  private final homework.h13.T2 task2 = new T2();

  @Test
  void equalCounts() {
    int[] input = new int[] {-2, -1, -1, 1, 2, 3};
    var actual = task2.maximumCount(input);

    assertThat(actual).isEqualTo(3);
  }

  @Test
  void zerosNotCounted() {
    int[] input = new int[] {-3, -2, -1, 0, 0, 1, 2};
    var actual = task2.maximumCount(input);

    assertThat(actual).isEqualTo(3);
  }

  @Test
  void onlyZeros() {
    int[] input = new int[] {0, 0, 0};
    var actual = task2.maximumCount(input);

    assertThat(actual).isZero();
  }

  @Test
  void singleElement() {
    int[] input = new int[] {-5};
    var actual = task2.maximumCount(input);

    assertThat(actual).isEqualTo(1);
  }

  @Test
  void minAndMaxValues() {
    int[] input = new int[] {-2000, -2000, 0, 2000};
    var actual = task2.maximumCount(input);

    assertThat(actual).isEqualTo(2);
  }

  @Test
  void maxLength() {
    int[] input = new int[2000];
    for (int i = 0; i < input.length; i++) {
      input[i] = i - 999;
    }
    var actual = task2.maximumCount(input);

    assertThat(actual).isEqualTo(1000);
  }
}
