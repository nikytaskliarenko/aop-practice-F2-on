package homework.h16;

// base
// https://leetcode.com/problems/flood-fill/
public class T1 {
  public int[][] floodFill(int[][] image, int sr, int sc, int color) {
    int original = image[sr][sc];
    if (original == color) return image;

    fill(image, sr, sc, color, original);
    return image;
  }

  void fill(int[][] image, int r, int c, int color, int original) {
    if (r < 0 || r >= image.length || c < 0 || c >= image[r].length) return;
    if (image[r][c] != original) return;

    image[r][c] = color;

    fill(image, r + 1, c, color, original);
    fill(image, r, c + 1, color, original);
    fill(image, r - 1, c, color, original);
    fill(image, r, c - 1, color, original);
  }
}
