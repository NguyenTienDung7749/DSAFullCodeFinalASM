package ASM1Code.CodeThuyetTrinh.LinkedList;

public class Main {
    public static void main(String[] args) {
        Gamer g1 = new Gamer(1,"BTEC.Dzungf",99);
        Gamer g2 = new Gamer(2,"MinQuang",30);
        Gamer g3 = new Gamer(3,"Bốp Bốp",3);

        System.out.print("Check Method Rank Của Obj g2: ");
        System.out.println(g2.getRank());

        MyList list1 = new MyList();
        list1.add(g1); list1.add(g2); list1.add(g3);
        System.out.println("List Ban Đầu: ");
        list1.traverse();

        list1.removeFirst(); list1.removeLast();
        System.out.println("List Sau Khi Xoá Đầu và Cuối:");
        list1.traverse();
    }
}
