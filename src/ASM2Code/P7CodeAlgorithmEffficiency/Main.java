package ASM2Code.P7CodeAlgorithmEffficiency;
import java.util.Arrays;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        // -------- Test execution time (speed) --------
        int n = 20000; // có thể tăng/giảm để chụp màn hình
        int[] original = randomArray(n, 100000);

        int[] arrBubble = Arrays.copyOf(original, original.length);
        int[] arrQuick  = Arrays.copyOf(original, original.length);

        System.out.println("=== Time Measurement: Bubble Sort vs Quick Sort ===");
        System.out.println("Array size n = " + n);

        long start1 = System.nanoTime();
        bubbleSort(arrBubble);
        long end1 = System.nanoTime();
        long bubbleTime = end1 - start1;

        long start2 = System.nanoTime();
        quickSort(arrQuick, 0, arrQuick.length - 1);
        long end2 = System.nanoTime();
        long quickTime = end2 - start2;

        System.out.println("Bubble Sort O(n^2)  time = " + bubbleTime + " ns");
        System.out.println("Quick  Sort O(n log n) time = " + quickTime + " ns");

        // -------- Test space usage (memory) --------
        int m = 500000; // input lớn để thấy chênh lệch memory
        int[] bigArray = randomArray(m, 1000);

        System.out.println("=== Space Measurement: O(1) vs O(n) Extra Memory ===");
        System.out.println("Array size m = " + m);

        long beforeInPlace = usedMemory();
        long sum1 = sumInPlace(bigArray);
        long afterInPlace = usedMemory();
        long memInPlace = afterInPlace - beforeInPlace;
        long beforeExtra = usedMemory();
        long sum2 = sumWithExtraArray(bigArray);
        long afterExtra = usedMemory();
        long memExtra = afterExtra - beforeExtra;

        System.out.println("Sum in-place (O(1) space) result = " + sum1);
        System.out.println("Approx. extra memory used = " + memInPlace + " bytes");

        System.out.println("Sum with extra array (O(n) space) result = " + sum2);
        System.out.println("Approx. extra memory used = " + memExtra + " bytes");

    }

    static int[] randomArray(int n, int bound) {
        Random rd = new Random();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = rd.nextInt(bound);
        }
        return a;
    }

    static long usedMemory() {
        Runtime rt = Runtime.getRuntime();
        rt.gc(); // request GC to reduce noise (không đảm bảo 100%)
        return rt.totalMemory() - rt.freeMemory();
    }

    // CODE VÍ DỤ TIME COMPLEXITY
    // Bubble Sort - O(n^2)
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Quick Sort - O(n log n)
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int p = partition(arr, low, high);
            quickSort(arr, low, p - 1);
            quickSort(arr, p + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }
        int t = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = t;
        return i + 1;
    }

    // CODE VÍ DỤ SPACE COMPLEXITY
    // O(1) extra space: chỉ dùng vài biến
    static long sumInPlace(int[] arr) {
        long sum = 0;
        for (int x : arr) {
            sum += x;
        }
        return sum;
    }

    // O(n) extra space: tạo thêm mảng tạm cùng kích thước
    static long sumWithExtraArray(int[] arr) {
        int n = arr.length;
        int[] copy = new int[n];   // bộ nhớ phụ O(n)
        for (int i = 0; i < n; i++) {
            copy[i] = arr[i];
        }

        long sum = 0;
        for (int x : copy) {
            sum += x;
        }
        return sum;
    }

}
