package homework.h15;

// advanced
// https://leetcode.com/problems/range-sum-of-bst/
public class T2 {
  public int rangeSumBST(TreeNode root, int low, int high) {
    int sum = 0;

    if (root == null) return 0;
    if (low <= root.val && high >= root.val) sum += root.val;
    if (low < root.val) sum += rangeSumBST(root.left, low, high);
    if (high > root.val) sum += rangeSumBST(root.right, low, high);
    return sum;
  }
}
