package ASM1Code.P2CodeMemoryStack;

public class Main {
    public static void main(String[] args) {
        int result = power(2, 3);
        System.out.println(result);
    }

    static int power(int base, int exp) {
        if (exp == 0)
            return 1;
        return base * power(base, exp - 1); 
    }
}
