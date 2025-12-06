package ASM1Code.DataStructure.LinkedListQueue;

public class Main {
    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.enqueue(10);
        q.enqueue(20);

        System.out.println("Dequeue: " + q.dequeue());

        q.enqueue(30);

        System.out.println("Front: " + q.front());
        System.out.println("Size: " + q.size());
    }
}
