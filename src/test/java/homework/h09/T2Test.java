package homework.h09;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

public class T2Test {
  private final T2 task2 = new T2();

  @Test
  void greatestInMiddle() {
    assertThat(task2.kidsWithCandies(new int[] {2, 3, 5, 1, 3}, 3))
        .containsExactly(true, true, true, false, true);
  }

  @Test
  void greatestAtStart() {
    assertThat(task2.kidsWithCandies(new int[] {4, 2, 1, 1, 2}, 1))
        .containsExactly(true, false, false, false, false);
  }

  @Test
  void greatestAtEnd() {
    assertThat(task2.kidsWithCandies(new int[] {1, 2, 3}, 1)).containsExactly(false, true, true);
  }

  @Test
  void severalKidsWithGreatest() {
    assertThat(task2.kidsWithCandies(new int[] {12, 1, 12}, 10)).containsExactly(true, false, true);
  }

  @Test
  void allEqual() {
    assertThat(task2.kidsWithCandies(new int[] {7, 7, 7}, 1)).containsExactly(true, true, true);
  }

  @Test
  void minValues() {
    assertThat(task2.kidsWithCandies(new int[] {1, 1}, 1)).containsExactly(true, true);
  }

  @Test
  void maxValues() {
    assertThat(task2.kidsWithCandies(new int[] {100, 100}, 50)).containsExactly(true, true);
  }

  @Test
  void minAndMaxCandies() {
    assertThat(task2.kidsWithCandies(new int[] {1, 100}, 50)).containsExactly(false, true);
  }

  @Test
  void maxLength() {
    int[] candies = new int[100];
    for (int i = 0; i < candies.length; i++) {
      candies[i] = i + 1;
    }

    List<Boolean> result = task2.kidsWithCandies(candies, 50);

    assertThat(result.subList(0, 49)).containsOnly(false);
    assertThat(result.subList(49, 100)).containsOnly(true);
  }
}
