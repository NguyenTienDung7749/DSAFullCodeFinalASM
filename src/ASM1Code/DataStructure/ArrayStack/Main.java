package ASM1Code.DataStructure.ArrayStack;

public class Main {
    public static void main(String[] args) {
        //Tạo ArrayStack Capacity 4
        ArrayStack myStack = new ArrayStack(4);
        myStack.push(1); myStack.push(2);
        myStack.push(3); myStack.push(4);
        System.out.println("Popped: " + myStack.pop());
        System.out.println("Top element: " + myStack.peek());
        System.out.println("Is stack empty: " + myStack.isEmpty());
        myStack.push(4);
        System.out.println("Is stack full: " + myStack.isFull());
    }
}
