package homework.h14;

import java.util.ArrayDeque;
import java.util.Deque;

// advanced
// https://leetcode.com/problems/implement-queue-using-stacks/
public class T2 {
  private final Deque<Integer> in;
  private final Deque<Integer> out;

  public T2() {
    in = new ArrayDeque<>();
    out = new ArrayDeque<>();
  }

  public void push(int x) {
    in.push(x);
  }

  public int pop() {
    if (out.isEmpty()) {
      while (!in.isEmpty()) {
        out.push(in.pop());
      }
    }
    return out.pop();
  }

  public int peek() {
    if (out.isEmpty()) {
      while (!in.isEmpty()) {
        out.push(in.pop());
      }
    }
    return out.peek();
  }

  public boolean empty() {
    return in.isEmpty() && out.isEmpty();
  }
}
