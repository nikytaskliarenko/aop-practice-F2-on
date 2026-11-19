package homework.h06;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T2Test {
  private final T2 task2 = new T2();

  @Test
  void palindrome() {
    String s = "A man, a plan, a canal: Panama";
    var actual = task2.isPalindrome(s);

    assertThat(actual).isTrue();
  }

  @Test
  void notPalindrome() {
    String s = "race a car";
    var actual = task2.isPalindrome(s);

    assertThat(actual).isFalse();
  }

  @Test
  void onlySpace() {
    String s = " ";
    var actual = task2.isPalindrome(s);

    assertThat(actual).isTrue();
  }

  @Test
  void singleCharacter() {
    String s = "a";
    var actual = task2.isPalindrome(s);

    assertThat(actual).isTrue();
  }

  @Test
  void ignoresCase() {
    String s = "Aa";
    var actual = task2.isPalindrome(s);

    assertThat(actual).isTrue();
  }

  @Test
  void digitAndLetter() {
    String s = "0P";
    var actual = task2.isPalindrome(s);

    assertThat(actual).isFalse();
  }

  @Test
  void digits() {
    String s = "12321";
    var actual = task2.isPalindrome(s);

    assertThat(actual).isTrue();
  }

  @Test
  void maxLength() {
    String s = "ab".repeat(50_000) + "ba".repeat(50_000);
    var actual = task2.isPalindrome(s);

    assertThat(actual).isTrue();
  }

  @Test
  void maxLengthNotPalindrome() {
    String s = "a".repeat(199_999) + "b";
    var actual = task2.isPalindrome(s);

    assertThat(actual).isFalse();
  }
}
