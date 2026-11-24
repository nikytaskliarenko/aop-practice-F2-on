package homework.h15;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T2Test {
  private final T2 task2 = new T2();

  private final TreeNode root =
      new TreeNode(
          10,
          new TreeNode(5, new TreeNode(3), new TreeNode(7)),
          new TreeNode(15, null, new TreeNode(18)));

  @Test
  void someInRange() {
    var actual = task2.rangeSumBST(root, 7, 15);

    assertThat(actual).isEqualTo(32);
  }

  @Test
  void wholeTreeInRange() {
    var actual = task2.rangeSumBST(root, 1, 100_000);

    assertThat(actual).isEqualTo(58);
  }

  @Test
  void noneInRange() {
    var actual = task2.rangeSumBST(root, 11, 14);

    assertThat(actual).isZero();
  }

  @Test
  void singleNodeInRange() {
    var actual = task2.rangeSumBST(new TreeNode(5), 1, 10);

    assertThat(actual).isEqualTo(5);
  }

  @Test
  void rangeBelowAllNodes() {
    var actual = task2.rangeSumBST(root, 1, 2);

    assertThat(actual).isZero();
  }

  @Test
  void rangeAboveAllNodes() {
    var actual = task2.rangeSumBST(root, 19, 100);

    assertThat(actual).isZero();
  }
}
