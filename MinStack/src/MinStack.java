import java.util.Stack;

public class MinStack {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public void push(int x) {
        if(s2.isEmpty() || x <= s2.peek()) s2.push(x);
        s1.push(x);
    }

    public void pop() {
        if(s2.peek().equals(s1.peek())) s2.pop();
        s1.pop();
    }

    public int top() {
        return s1.peek();
    }

    public int getMin() {
        return s2.peek();
    }
}
