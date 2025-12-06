package ASM1Code.DataStructure.ArrayQueue;

public class myQueue {
    private int[] arr;
    private int capacity;
    private int size;

    // Constructor
    public myQueue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        size = 0;
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Check if queue is full
    public boolean isFull() {
        return size == capacity;
    }

    // Enqueue
    public void enqueue(int x) {
        if (isFull()) {
            System.out.println("Queue is full!");
            return;
        }
        arr[size] = x; size++;
    }

    // Dequeue
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        for (int i = 1; i < size; i++) {
            arr[i - 1] = arr[i];
        } size--;
    }

    // Get front element
    public int front() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        } return arr[0];
    }
    //Get last element
    public int getRear() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return arr[size - 1];
    }

}
