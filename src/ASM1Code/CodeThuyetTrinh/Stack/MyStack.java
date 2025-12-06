package ASM1Code.CodeThuyetTrinh.Stack;

import ASM1Code.CodeThuyetTrinh.LinkedList.Gamer;
public class MyStack {

    private static class Node {
        Gamer gamer;
        Node next;
        Node(Gamer gamer) { this.gamer = gamer; }
    }

    private Node top;

    public MyStack() { top = null; }

    public boolean isEmpty() { return top == null; }

    public void push(Gamer gamer) {
        Node q = new Node(gamer);
        q.next = top;
        top = q;
    }

    public Gamer pop() {
        if (isEmpty()) return null;
        Gamer x = top.gamer;
        top = top.next;
        return x;
    }

    public Gamer peek() { return isEmpty() ? null : top.gamer; }

    public void traverse() {
        Node p = top;
        while (p != null) {
            System.out.println(p.gamer.toString());
            p = p.next;
        }
    }
}
