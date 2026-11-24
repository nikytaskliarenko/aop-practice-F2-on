package homework.h15;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T1Test {
  private final T1 task1 = new T1();

  @Test
  void fullTree() {
    var root =
        new TreeNode(
            4,
            new TreeNode(2, new TreeNode(1), new TreeNode(3)),
            new TreeNode(7, new TreeNode(6), new TreeNode(9)));
    var actual = task1.invertTree(root);

    assertThat(actual.val).isEqualTo(4);
    assertThat(actual.left.val).isEqualTo(7);
    assertThat(actual.right.val).isEqualTo(2);
    assertThat(actual.left.left.val).isEqualTo(9);
    assertThat(actual.left.right.val).isEqualTo(6);
    assertThat(actual.right.left.val).isEqualTo(3);
    assertThat(actual.right.right.val).isEqualTo(1);
  }

  @Test
  void emptyTree() {
    var actual = task1.invertTree(null);

    assertThat(actual).isNull();
  }

  @Test
  void singleNode() {
    var root = new TreeNode(1);
    var actual = task1.invertTree(root);

    assertThat(actual.val).isEqualTo(1);
    assertThat(actual.left).isNull();
    assertThat(actual.right).isNull();
  }
}
