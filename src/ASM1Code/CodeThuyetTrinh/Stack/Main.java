package ASM1Code.CodeThuyetTrinh.Stack;

import ASM1Code.CodeThuyetTrinh.LinkedList.Gamer;

public class Main {
    public static void main(String[] args) {
        Gamer g1 = new Gamer(1,"BTEC.Dzungf",999);
        Gamer g2 = new Gamer(2,"MinQuang",30);
        Gamer g3 = new Gamer(3,"Bốp Bốp",3);

        MyStack st1 = new MyStack();
        st1.push(g1); st1.push(g2); st1.push(g3);
        st1.traverse();

        System.out.println(st1.pop());

        System.out.println("Stack sau khi pop:");
        st1.traverse();

        System.out.println("Phần Tử trên cùng");
        System.out.println(st1.peek());
    }
}
