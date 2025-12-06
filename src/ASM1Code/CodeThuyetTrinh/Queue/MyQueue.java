package ASM1Code.CodeThuyetTrinh.Queue;

import ASM1Code.CodeThuyetTrinh.LinkedList.Gamer;
public class MyQueue {
    private static class Node {
        Gamer gamer;
        Node next;

        Node(Gamer gamer) {
            this.gamer = gamer;
            this.next = null;
        }
    }

    private Node head, tail;

    public MyQueue() {
        head = tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    // Lấy và bỏ phần tử cuối
    public void enqueue(Gamer gamer) {
        Node q = new Node(gamer);
        if (isEmpty()) {
            head = tail = q;
        } else {
            tail.next = q;
            tail = q;
        }
    }

    // Lấy và bỏ phần tử đầu
    public Gamer dequeue() {
        if (isEmpty()) return null;
        Gamer gamer = head.gamer;
        head = head.next;
        if (head == null) tail = null;
        return gamer;
    }

    // Xem phần tử đầu
    public Gamer front() {
        return isEmpty() ? null : head.gamer;
    }

    // Duyệt hàng đợi
    public void traverse() {
        Node p = head;
        while (p != null) {
            System.out.println(p.gamer.toString());
            p = p.next;
        }
    }
}