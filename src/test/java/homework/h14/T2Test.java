package homework.h14;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T2Test {
  private final T2 task2 = new T2();

  @Test
  void basicOperations() {
    task2.push(1);
    task2.push(2);

    assertThat(task2.peek()).isEqualTo(1);
    assertThat(task2.pop()).isEqualTo(1);
    assertThat(task2.empty()).isFalse();
  }

  @Test
  void emptyOnStart() {
    assertThat(task2.empty()).isTrue();
  }

  @Test
  void increasingOrder() {
    task2.push(1);
    task2.push(2);
    task2.push(3);

    assertThat(task2.pop()).isEqualTo(1);
    assertThat(task2.pop()).isEqualTo(2);
    assertThat(task2.pop()).isEqualTo(3);
    assertThat(task2.empty()).isTrue();
  }

  @Test
  void maxCalls() {
    for (int i = 0; i < 50; i++) {
      task2.push(i % 9 + 1);
    }
    for (int i = 0; i < 50; i++) {
      assertThat(task2.pop()).isEqualTo(i % 9 + 1);
    }
    assertThat(task2.empty()).isTrue();
  }
}
