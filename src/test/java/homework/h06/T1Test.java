package homework.h06;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T1Test {
  private final T1 task1 = new T1();

  @Test
  void anagram() {
    String s = "anagram";
    String t = "nagaram";
    var actual = task1.isAnagram(s, t);

    assertThat(actual).isTrue();
  }

  @Test
  void notAnagram() {
    String s = "rat";
    String t = "car";
    var actual = task1.isAnagram(s, t);

    assertThat(actual).isFalse();
  }

  @Test
  void differentLength() {
    String s = "ab";
    String t = "abb";
    var actual = task1.isAnagram(s, t);

    assertThat(actual).isFalse();
  }

  @Test
  void sameLettersDifferentCounts() {
    String s = "aab";
    String t = "abb";
    var actual = task1.isAnagram(s, t);

    assertThat(actual).isFalse();
  }

  @Test
  void singleSameCharacter() {
    String s = "a";
    String t = "a";
    var actual = task1.isAnagram(s, t);

    assertThat(actual).isTrue();
  }

  @Test
  void singleDifferentCharacter() {
    String s = "a";
    String t = "z";
    var actual = task1.isAnagram(s, t);

    assertThat(actual).isFalse();
  }

  @Test
  void maxLength() {
    String s = "abcdefghij".repeat(5_000);
    String t = "jihgfedcba".repeat(5_000);
    var actual = task1.isAnagram(s, t);

    assertThat(actual).isTrue();
  }

  @Test
  void maxLengthNotAnagram() {
    String s = "a".repeat(50_000);
    String t = "a".repeat(49_999) + "b";
    var actual = task1.isAnagram(s, t);

    assertThat(actual).isFalse();
  }
}
