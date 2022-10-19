//Stack using Arrays :

import java.util.EmptyStackException;

public class Stack1 {
    private int[] arr;
    private int top;
    private int size;

    public Stack1(int size) {
        this.size = size;
        this.arr = new int[size];
        top = -1;
    }

    // ------------------------------------------------------------------
    public void push(int element) {
        if (size - top > 1) {
            top++;
            arr[top] = element;
            System.out.println(element + " is pushed in Stack");
        } else {
            throw new StackOverflowError();
        }
    }

    // ------------------------------------------------------------------
    public void pop() {
        if (top >= 0) {
            System.out.println(arr[top] + " is popped out from the Stack");
            top--;
        } else {
            System.out.println("Stack UnderFlow");
        }
    }

    // -----------------------------------------------------------------
    public int peek() {
        if (top >= 0) {
            return arr[top];
        } else {
            throw new EmptyStackException();
        }
    }

    // ------------------------------------------------------------------
    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    // -----------------------------------------------------------------
    public static void main(String[] args) {
        Stack1 stack1 = new Stack1(5);
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);
        stack1.push(5);

        stack1.pop();
        stack1.pop();
        stack1.pop();
        stack1.pop();
        stack1.pop();
        stack1.pop();
    }
}
