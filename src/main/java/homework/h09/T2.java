package homework.h09;

import java.util.ArrayList;
import java.util.List;

// advanced
// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
public class T2 {
  public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    int greatest = 0;
    List<Boolean> result = new ArrayList<>();

    for (int candy : candies) {
      if (candy > greatest) greatest = candy;
    }

    for (int candy : candies) {
      if (candy + extraCandies >= greatest) {
        result.add(true);
      } else {
        result.add(false);
      }
    }
    return result;
  }
}
