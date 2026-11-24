package homework.h16;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T2Test {
  private final T2 task2 = new T2();

  @Test
  void twoPeople() {
    int[][] trust = new int[][] {{1, 2}};
    var actual = task2.findJudge(2, trust);

    assertThat(actual).isEqualTo(2);
  }

  @Test
  void everyoneTrustsJudge() {
    int[][] trust = new int[][] {{1, 3}, {2, 3}};
    var actual = task2.findJudge(3, trust);

    assertThat(actual).isEqualTo(3);
  }

  @Test
  void judgeTrustsSomeone() {
    int[][] trust = new int[][] {{1, 3}, {2, 3}, {3, 1}};
    var actual = task2.findJudge(3, trust);

    assertThat(actual).isEqualTo(-1);
  }

  @Test
  void notEveryoneTrusts() {
    int[][] trust = new int[][] {{1, 3}, {2, 3}};
    var actual = task2.findJudge(4, trust);

    assertThat(actual).isEqualTo(-1);
  }

  @Test
  void singlePerson() {
    int[][] trust = new int[][] {};
    var actual = task2.findJudge(1, trust);

    assertThat(actual).isEqualTo(1);
  }

  @Test
  void noTrustAtAll() {
    int[][] trust = new int[][] {};
    var actual = task2.findJudge(2, trust);

    assertThat(actual).isEqualTo(-1);
  }

  @Test
  void maxSize() {
    int n = 1000;
    int[][] trust = new int[2 * n - 3][];
    int k = 0;
    for (int i = 1; i < n; i++) {
      trust[k++] = new int[] {i, n};
    }
    for (int i = 1; i < n - 1; i++) {
      trust[k++] = new int[] {i, i + 1};
    }
    var actual = task2.findJudge(n, trust);

    assertThat(actual).isEqualTo(1000);
  }
}
