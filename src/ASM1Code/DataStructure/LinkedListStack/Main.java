package ASM1Code.DataStructure.LinkedListStack;

public class Main {
    public static void main(String[] args) {
        LinkedListStack myStack = new LinkedListStack();
        myStack.push(1); myStack.push(2);
        myStack.push(3); myStack.push(4);
        System.out.println("Popped: " + myStack.pop());
        System.out.println("Top element: " + myStack.peek());
        System.out.println("Is stack empty: " + (myStack.isEmpty()));
    }
}
