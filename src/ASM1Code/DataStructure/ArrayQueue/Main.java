package ASM1Code.DataStructure.ArrayQueue;

public class Main {
    public static void main(String[] args) {
        myQueue q = new myQueue(3);
        q.enqueue(10); q.enqueue(20); q.enqueue(30);
        System.out.println("Front Gốc: " + q.front());
        q.dequeue();
        System.out.println("Front Sau khi Đè Que: " + q.front());
        // Các operation chạy ngon
    }
}
