package homework.h03;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T1Test {
  private final T1 task1 = new T1();

  @Test
  void unsorted() {
    int[] input = new int[] {4000, 3000, 1000, 2000};
    var actual = task1.average(input);

    assertThat(actual).isEqualTo(2500.0);
  }

  @Test
  void sorted() {
    int[] input = new int[] {1000, 2000, 3000};
    var actual = task1.average(input);

    assertThat(actual).isEqualTo(2000.0);
  }

  @Test
  void nonIntegerAverage() {
    int[] input = new int[] {1000, 2000, 2001, 9000};
    var actual = task1.average(input);

    assertThat(actual).isEqualTo(2000.5);
  }

  @Test
  void minAndMaxSalary() {
    int[] input = new int[] {1000, 1_000_000, 500_000};
    var actual = task1.average(input);

    assertThat(actual).isEqualTo(500_000.0);
  }

  @Test
  void maxLength() {
    int[] input = new int[100];
    for (int i = 0; i < input.length; i++) {
      input[i] = 1_000_000 - i;
    }
    var actual = task1.average(input);

    assertThat(actual).isEqualTo(999_950.5);
  }
}
