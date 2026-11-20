package homework.h12;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T2Test {
  private final T2 task2 = new T2();

  @Test
  void duplicatesAndExtras() {
    int[] arr1 = new int[] {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
    int[] arr2 = new int[] {2, 1, 4, 3, 9, 6};
    var actual = task2.relativeSortArray(arr1, arr2);

    assertThat(actual).containsExactly(2, 2, 2, 1, 4, 3, 3, 9, 6, 7, 19);
  }

  @Test
  void noExtras() {
    int[] arr1 = new int[] {3, 1, 2, 1};
    int[] arr2 = new int[] {1, 2, 3};
    var actual = task2.relativeSortArray(arr1, arr2);

    assertThat(actual).containsExactly(1, 1, 2, 3);
  }

  @Test
  void singleElement() {
    int[] arr1 = new int[] {5};
    int[] arr2 = new int[] {5};
    var actual = task2.relativeSortArray(arr1, arr2);

    assertThat(actual).containsExactly(5);
  }

  @Test
  void minAndMaxValues() {
    int[] arr1 = new int[] {1000, 0, 1000, 500};
    int[] arr2 = new int[] {1000};
    var actual = task2.relativeSortArray(arr1, arr2);

    assertThat(actual).containsExactly(1000, 1000, 0, 500);
  }

  @Test
  void maxLength() {
    int[] arr1 = new int[1000];
    int[] arr2 = new int[1000];
    for (int i = 0; i < arr1.length; i++) {
      arr1[i] = i;
      arr2[i] = arr2.length - 1 - i;
    }
    var actual = task2.relativeSortArray(arr1, arr2);

    assertThat(actual).containsExactly(arr2);
  }
}
