package ASM1Code.DataStructure.ArrayStack;

public class ArrayStack {
    // // Mảng để lưu trữ phần tử
    int[] arr;
    // Kích thước max stack, phần tử trên cùng (top)
    int capacity, top;
    public ArrayStack(int cap) {
        capacity = cap;
        arr = new int[capacity];
        top = -1; // Biểu thị stack rỗng
    }

    void push(int x) {

        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = x;
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }

    int peek() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return arr[top];
    }

    // Array Stack
    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == capacity - 1;
    }
}
