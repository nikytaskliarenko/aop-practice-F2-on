package homework.h09;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T2Test {
  private final T2 task2 = new T2();

  @Test
  void greatestInMiddle() {
    int[] input = new int[] {2, 3, 5, 1, 3};
    int x = 3;
    var actual = task2.kidsWithCandies(input, x);

    assertThat(actual).containsExactly(true, true, true, false, true);
  }

  @Test
  void greatestAtStart() {
    int[] input = new int[] {4, 2, 1, 1, 2};
    int x = 1;
    var actual = task2.kidsWithCandies(input, x);

    assertThat(actual).containsExactly(true, false, false, false, false);
  }

  @Test
  void greatestAtEnd() {
    int[] input = new int[] {1, 2, 3};
    int x = 1;
    var actual = task2.kidsWithCandies(input, x);

    assertThat(actual).containsExactly(false, true, true);
  }

  @Test
  void severalKidsWithGreatest() {
    int[] input = new int[] {12, 1, 12};
    int x = 10;
    var actual = task2.kidsWithCandies(input, x);

    assertThat(actual).containsExactly(true, false, true);
  }

  @Test
  void allEqual() {
    int[] input = new int[] {7, 7, 7};
    int x = 1;
    var actual = task2.kidsWithCandies(input, x);

    assertThat(actual).containsExactly(true, true, true);
  }

  @Test
  void minValues() {
    int[] input = new int[] {1, 1};
    int x = 1;
    var actual = task2.kidsWithCandies(input, x);

    assertThat(actual).containsExactly(true, true);
  }

  @Test
  void maxValues() {
    int[] input = new int[] {100, 100};
    int x = 50;
    var actual = task2.kidsWithCandies(input, x);

    assertThat(actual).containsExactly(true, true);
  }

  @Test
  void minAndMaxCandies() {
    int[] input = new int[] {1, 100};
    int x = 50;
    var actual = task2.kidsWithCandies(input, x);

    assertThat(actual).containsExactly(false, true);
  }

  @Test
  void maxLength() {
    int[] input = new int[100];
    for (int i = 0; i < input.length; i++) {
      input[i] = i + 1;
    }
    int x = 50;
    var actual = task2.kidsWithCandies(input, x);

    assertThat(actual.subList(0, 49)).containsOnly(false);
    assertThat(actual.subList(49, 100)).containsOnly(true);
  }
}
