package stack;

import java.util.Stack;

/**
 * Created by user on 16/3/16.
 */
public class StackMockQueue {

    private Stack<Integer> stack1;

    private Stack<Integer> stack2;

    public StackMockQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int element) {
        stack1.push(element);
    }

    public int pop() {
        if (stack2.empty()) {
            stack1ToStack2(stack1, stack2);
        }
        return stack2.pop();
    }


    public int top() {
        if (stack2.empty()) {
            stack1ToStack2(stack1, stack2);
        }
        return stack2.peek();
    }


    public void stack1ToStack2(Stack stack1, Stack stack2) {
        while(!stack1.empty()) {
            stack2.push(stack1.pop());
        }
    }
}
