package homework.h10;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T2Test {
  private final T2 task2 = new T2();

  @Test
  void oddLength() {
    char[] input = new char[] {'h', 'e', 'l', 'l', 'o'};
    task2.reverseString(input);

    assertThat(input).containsExactly('o', 'l', 'l', 'e', 'h');
  }

  @Test
  void evenLength() {
    char[] input = new char[] {'H', 'a', 'n', 'n', 'a', 'h'};
    task2.reverseString(input);

    assertThat(input).containsExactly('h', 'a', 'n', 'n', 'a', 'H');
  }

  @Test
  void singleCharacter() {
    char[] input = new char[] {'a'};
    task2.reverseString(input);

    assertThat(input).containsExactly('a');
  }

  @Test
  void twoCharacters() {
    char[] input = new char[] {'a', 'b'};
    task2.reverseString(input);

    assertThat(input).containsExactly('b', 'a');
  }

  @Test
  void printableAsciiBounds() {
    char[] input = new char[] {' ', '5', '~'};
    task2.reverseString(input);

    assertThat(input).containsExactly('~', '5', ' ');
  }

  @Test
  void maxLength() {
    char[] input = new char[100_000];
    for (int i = 0; i < input.length; i++) {
      input[i] = (char) (' ' + i % 95);
    }
    char[] expected = new char[input.length];
    for (int i = 0; i < input.length; i++) {
      expected[i] = input[input.length - 1 - i];
    }
    task2.reverseString(input);

    assertThat(input).containsExactly(expected);
  }
}
