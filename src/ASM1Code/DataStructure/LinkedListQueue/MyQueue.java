package ASM1Code.DataStructure.LinkedListQueue;

public class MyQueue {
    private Node front;
    private Node rear;
    private int currSize;

    public MyQueue() {
        currSize = 0;
        front = rear = null;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(int new_data) {
        Node new_node = new Node(new_data);
        if (isEmpty()) {
            front = rear = new_node;
        } else {
            rear.next = new_node;
            rear = new_node;
        }
        currSize++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }
        Node temp = front;
        int removedData = temp.data;
        front = front.next;
        if (front == null) rear = null;

        currSize--;
        return removedData;
    }

    public int front() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return front.data;
    }

    public int size() {
        return currSize;
    }

}
