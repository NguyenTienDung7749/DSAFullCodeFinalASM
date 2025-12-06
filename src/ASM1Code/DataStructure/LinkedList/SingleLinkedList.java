package ASM1Code.DataStructure.LinkedList;

public class SingleLinkedList {
    Node head;
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) { head = newNode; return;}
        Node current = head;
        while (current.next != null) { current = current.next; }
        current.next = newNode;
    }

    public void traverse() {
        Node current = head;
        System.out.println("Bắt đầu duyệt linked list");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("Kết thúc duyệt");
    }

    public void delete(int data) {
        // TH1: Danh sách rỗng
        if (head == null) { System.out.println("Danh sách rỗng, không có gì để xoá.");
            return; }
        // TH2: Xoá phần tử chính là head ( đầu toa tàu )
        if (head.data == data) {
            head = head.next;
            System.out.println("Đã xoá node head có giá trị: " + data);
            return;
        }
        // TH3: Node cần xoá nằm ở giữa hoặc cuối danh sách
        Node previous = head; Node current = head.next; // Kiểm tra từ node thứ 2

        while (current != null) {
            if (current.data == data) {
                previous.next = current.next;
                System.out.println("Đã xoá node có giá trị: " + data);
                return;
            }
            previous = current; // Nếu ko tìm thấy, di chuyển cả 2 con trỏ
            current = current.next;
        }
        // TH4: Không tìm thấy Node chứa Data cần xoá
        System.out.println("Không tìm thấy node có giá trị " + data + " để xoá.");
    }

    public void insert(int data, int position) {
        Node newNode = new Node(data);
        // Trường hợp 1: Chèn vào đầu hoặc nếu danh sách rỗng và position là 0
        if (position == 0) {
            newNode.next = head; head = newNode;
            // Node mới trỏ vào head cũ và Node mới trở thành head
            System.out.println("Đã chèn " + data);
            return;
        }
        // Trường hợp 2: Chèn vào giữa hoặc cuối danh sách
        // Duyệt đến vị trí NGAY TRƯỚC vị trí muốn chèn
        Node current = head; int count = 0;
        while (current != null && count < position - 1) {
            current = current.next; count++;
        }
        // Kiểm tra xem vị trí có hợp lệ không (position > độ dài)
        if (current == null) { System.out.println("Vị trí vượt quá độ dài danh sách "); return; }
        // Thực hiện chèn:
        newNode.next = current.next; current.next = newNode;
        System.out.println("Đã chèn " + data);
    }

    public void search(int data) {
        // Trường hợp 1: Danh sách rỗng
        if (head == null) { System.out.println("Danh sách rỗng"); return; }

        // Trường hợp 2: Duyệt qua danh sách
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                // Đã tìm thấy Node chứa giá trị data
                System.out.println("Tìm thấy " + data);
                return;
            }
            current = current.next;
        }
        // Trường hợp 3: Duyệt hết danh sách không thấy
        System.out.println("Không tìm thấy " + data);
        return;
    }
}
