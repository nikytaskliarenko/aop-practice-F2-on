package homework.h14;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T1Test {
  private final T1 task1 = new T1();

  @Test
  void removesPairs() {
    var actual = task1.removeDuplicates("abbaca");

    assertThat(actual).isEqualTo("ca");
  }

  @Test
  void noDuplicates() {
    var actual = task1.removeDuplicates("abc");

    assertThat(actual).isEqualTo("abc");
  }

  @Test
  void removesAll() {
    var actual = task1.removeDuplicates("abba");

    assertThat(actual).isEmpty();
  }

  @Test
  void singleCharacter() {
    var actual = task1.removeDuplicates("a");

    assertThat(actual).isEqualTo("a");
  }

  @Test
  void maxLength() {
    String input = "ab".repeat(25_000) + "ba".repeat(25_000);
    var actual = task1.removeDuplicates(input);

    assertThat(actual).isEmpty();
  }
}
