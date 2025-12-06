package ASM1Code.M3CodeUsingADT;

public class Main {
    public static void main(String[] args) {
        GoodStack st = new GoodStack(5);

        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println(st.pop());   // 30
        System.out.println(st.peek());  // 20
    }
}
