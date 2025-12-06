package ASM1Code.CodeThuyetTrinh.Queue;

import ASM1Code.CodeThuyetTrinh.LinkedList.Gamer;
public class Main {
    public static void main(String[] args) {
        Gamer g1 = new Gamer(1, "BTEC.Dzungf", 999);
        Gamer g2 = new Gamer(2, "MinQuang", 30);
        Gamer g3 = new Gamer(3, "Bốp Bốp", 3);

        MyQueue q = new MyQueue();
        q.enqueue(g1); q.enqueue(g2); q.enqueue(g3);
        q.traverse();

        System.out.println("Object bị Lấy ra:");
        System.out.println(q.dequeue());

        System.out.println("Queue Sau khi Dequeue");
        q.traverse();

        System.out.println("Phần Tử ngoài cùng hàng đợi");
        System.out.println(q.front());
    }
}
