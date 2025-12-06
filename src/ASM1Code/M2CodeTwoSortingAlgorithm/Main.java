package ASM1Code.M2CodeTwoSortingAlgorithm;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int size = 1000; // Thay Kích Thước Test
        int[] data = new int[size];
        Random rd = new Random();

        for (int i = 0; i < size; i++) {
            data[i] = rd.nextInt(1000000);
        }

        int[] arrBubble = data.clone();
        int[] arrQuick = data.clone();

        // ---- Bubble Sort ----
        long start = System.nanoTime();
        SortingAlgorithms.bubbleSort(arrBubble);
        long end = System.nanoTime();
        long bubbleTime = end - start;
        // ---- Quick Sort ----
        start = System.nanoTime();
        SortingAlgorithms.quickSort(arrQuick, 0, arrQuick.length - 1);
        end = System.nanoTime();
        long quickTime = end - start;

        // ---- Print results ----
        System.out.println("===== Sorting Comparison =====");
        System.out.println("Array size: " + size);
        System.out.println("Bubble Sort time: " + bubbleTime + " ns");
        System.out.println("Quick Sort time : " + quickTime + " ns");
    }
}
