package homework.h08;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;

public class T2Test {
  private final T2 task2 = new T2();

  @Test
  void somePairs() {
    List<Integer> input = List.of(-1, 1, 2, 3, 1);
    int target = 2;
    var actual = task2.countPairs(input, target);

    assertThat(actual).isEqualTo(3);
  }

  @Test
  void negativeTarget() {
    List<Integer> input = List.of(-6, 2, 5, -2, -7, -1, 3);
    int target = -2;
    var actual = task2.countPairs(input, target);

    assertThat(actual).isEqualTo(10);
  }

  @Test
  void sumEqualToTarget() {
    List<Integer> input = List.of(1, 1);
    int target = 2;
    var actual = task2.countPairs(input, target);

    assertThat(actual).isZero();
  }

  @Test
  void singleElement() {
    List<Integer> input = List.of(-50);
    int target = 50;
    var actual = task2.countPairs(input, target);

    assertThat(actual).isZero();
  }

  @Test
  void maxLengthMinValuesAllPairs() {
    List<Integer> input = Collections.nCopies(50, -50);
    int target = 50;
    var actual = task2.countPairs(input, target);

    assertThat(actual).isEqualTo(1225);
  }

  @Test
  void maxSumEqualToMaxTarget() {
    List<Integer> input = List.of(50, 0);
    int target = 50;
    var actual = task2.countPairs(input, target);

    assertThat(actual).isZero();
  }
}
