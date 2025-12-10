package ASM2Code.P6CodeAsymptoticExamples;
// Asymptotic Examples
// Cung cấp hàm nội bộ java cơ bản test Big-O, Big-Omega and Big-Theta notation.
public class Main {
    public static void main(String[] args) {
        int n = 200;
        System.out.println("=== Big-O Example: tripleLoop O(n^3) ===");
        long start1 = System.nanoTime();
        tripleLoop(n);
        long end1 = System.nanoTime();
        System.out.println("n = " + n + " -> time = " + (end1 - start1) + " ns");


        System.out.println("\n=== Big-Omega Example: printAll Ω(n) ===");
        long start2 = System.nanoTime();
        printAll(n);
        long end2 = System.nanoTime();
        System.out.println("n = " + n + " -> time = " + (end2 - start2) + " ns");

        System.out.println("\n=== Big-Theta Example: pairSum Θ(n^2) ===");
        long start3 = System.nanoTime();
        pairSum(n);
        long end3 = System.nanoTime();
        System.out.println("n = " + n + " -> time = " + (end3 - start3) + " ns");

    }
    // Big-O Example
    static void tripleLoop(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                }
            }
        }
    }
    // Big-Omega Example
    static void printAll(int n) {
        for (int i = 0; i < n; i++) {
        }
    }
    // Big-Theta Example
    static void pairSum(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int s = i + j; // O(1)
            }
        }
    }
}
