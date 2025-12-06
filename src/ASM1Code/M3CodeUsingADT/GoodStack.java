package ASM1Code.M3CodeUsingADT;

// ADT Stack with encapsulation and information hiding
public class GoodStack {
    private int[] data;    // dữ liệu bị ẩn (private)
    private int top;       // con trỏ bị ẩn

    public GoodStack(int capacity) {
        data = new int[capacity];
        top = -1;
    }

    // ----- Public interface -----
    public void push(int value) {
        if (top == data.length - 1) {
            throw new RuntimeException("Stack is full");
        }
        data[++top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return data[top--];
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return data[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}

