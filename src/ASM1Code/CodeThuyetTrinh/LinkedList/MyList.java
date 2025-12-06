package ASM1Code.CodeThuyetTrinh.LinkedList;

public class MyList {
    Node head, tail;
    public MyList() {
        head = tail = null;
    }

    public boolean isEmpty() {
        return (head == null);
    }

    public void add(Gamer s) {
        Node q = new Node(s);
        if (isEmpty()) {
            head = tail = q;
        }
        else {
            tail.next = q;
            tail = q;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Danh sách rỗng!");
            return;
        }
        head = head.next;
        if (head == null) tail = null;
    }


    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Danh sách rỗng!");
            return;
        }
        if (head == tail) {
            head = tail = null;
            return;
        }
        Node p = head;
        while (p.next != tail) {
            p = p.next;
        }
        p.next = null;
        tail = p;
    }

    public void traverse(){
        Node p = head;
        while (p != null){
            System.out.println(p.gamer.toString());
            p = p.next;
        }
    }
}
