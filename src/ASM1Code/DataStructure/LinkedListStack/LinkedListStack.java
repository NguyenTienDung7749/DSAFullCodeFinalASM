package ASM1Code.DataStructure.LinkedListStack;

public class LinkedListStack {
    // con trỏ trỏ đến nút trên cùng
    private Node top;

    public LinkedListStack() {
        // Ban đầu stack rỗng
        top = null;
    }

    void push(int x) {
        Node temp = new Node(x);
        temp.next = top;
        top = temp;
    }

    public int pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return -1;
        }
        Node temp = top;
        top = top.next;
        int val = temp.data;
        temp = null;
        return val;
    }

    int peek() {
        if (top == null) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return top.data;
    }

    // Linked List Stack
    boolean isEmpty() {
        return top == null;
    }
}
