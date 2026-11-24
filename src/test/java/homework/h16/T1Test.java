package homework.h16;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class T1Test {
  private final T1 task1 = new T1();

  @Test
  void connectedRegion() {
    int[][] image = new int[][] {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
    var actual = task1.floodFill(image, 1, 1, 2);

    assertThat(actual).isDeepEqualTo(new int[][] {{2, 2, 2}, {2, 2, 0}, {2, 0, 1}});
  }

  @Test
  void sameColor() {
    int[][] image = new int[][] {{0, 0, 0}, {0, 0, 0}};
    var actual = task1.floodFill(image, 0, 0, 0);

    assertThat(actual).isDeepEqualTo(new int[][] {{0, 0, 0}, {0, 0, 0}});
  }

  @Test
  void singlePixel() {
    int[][] image = new int[][] {{5}};
    var actual = task1.floodFill(image, 0, 0, 7);

    assertThat(actual).isDeepEqualTo(new int[][] {{7}});
  }

  @Test
  void wholeImage() {
    int[][] image = new int[][] {{2, 2}, {2, 2}};
    var actual = task1.floodFill(image, 1, 1, 9);

    assertThat(actual).isDeepEqualTo(new int[][] {{9, 9}, {9, 9}});
  }

  @Test
  void maxSizeWithWall() {
    int[][] image = new int[50][50];
    int[][] expected = new int[50][50];
    for (int i = 0; i < 50; i++) {
      Arrays.fill(image[i], 1);
      image[i][25] = 0;

      Arrays.fill(expected[i], 0, 25, 2);
      Arrays.fill(expected[i], 26, 50, 1);
    }
    var actual = task1.floodFill(image, 0, 0, 2);

    assertThat(actual).isDeepEqualTo(expected);
  }
}
