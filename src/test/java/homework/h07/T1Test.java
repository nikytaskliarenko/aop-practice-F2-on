package homework.h07;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T1Test {
  private final T1 task1 = new T1();

  @Test
  void minN() {
    int n = 1;
    var actual = task1.fizzBuzz(n);

    assertThat(actual).containsExactly("1");
  }

  @Test
  void toFizz() {
    int n = 3;
    var actual = task1.fizzBuzz(n);

    assertThat(actual).containsExactly("1", "2", "Fizz");
  }

  @Test
  void toBuzz() {
    int n = 5;
    var actual = task1.fizzBuzz(n);

    assertThat(actual).containsExactly("1", "2", "Fizz", "4", "Buzz");
  }

  @Test
  void toFizzBuzz() {
    int n = 15;
    var actual = task1.fizzBuzz(n);

    assertThat(actual)
        .containsExactly(
            "1",
            "2",
            "Fizz",
            "4",
            "Buzz",
            "Fizz",
            "7",
            "8",
            "Fizz",
            "Buzz",
            "11",
            "Fizz",
            "13",
            "14",
            "FizzBuzz");
  }

  @Test
  void maxN() {
    int n = 10_000;
    var actual = task1.fizzBuzz(n);

    assertThat(actual).hasSize(10_000);
    assertThat(actual.get(9_989)).isEqualTo("FizzBuzz");
    assertThat(actual.get(9_998)).isEqualTo("Fizz");
    assertThat(actual.get(9_996)).isEqualTo("9997");
    assertThat(actual.get(9_999)).isEqualTo("Buzz");
  }
}
