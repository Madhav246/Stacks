//Stack using LinkedList :

import java.util.EmptyStackException;

public class Stack {
    private ListNode top;
    private int length;

    public class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            next = null;
        }
    }

    public Stack() {
        top = null;
        length = 0;
    }

    public int length() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    // --------------------------------------------------------------
    public void push(int value) {
        ListNode temp = new ListNode(value);
        temp.next = top;
        top = temp;
        length++;
    }

    // -------------------------------------------------------------
    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int result = top.data;
        top = top.next;
        length--;
        return result;
    }

    // ------------------------------------------------------------
    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.data;
    }

    // ------------------------------------------------------------

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
    }
}
