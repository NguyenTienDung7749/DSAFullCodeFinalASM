package ASM1Code.D2Code_ImperativeADT_OOP;

public class Stack implements StackADT {
    private int[] data;
    private int top;

    public Stack(int capacity) {
        data = new int[capacity];
        top = -1;
    }
    public void push(int value) {
        data[++top] = value;
    }
    public int pop() {
        return data[top--];
    }
    public int peek() {
        return data[top];
    }
    public boolean isEmpty() {
        return top == -1;
    }
}

