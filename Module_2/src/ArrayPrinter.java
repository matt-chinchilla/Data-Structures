public class ArrayPrinter {
    public static void printArrays(Integer[] originalArray, Integer[] incrementedArray) {
        System.out.println("Original array:");
        printArray(originalArray);
        System.out.println("Array after incrementing:");
        printArray(incrementedArray);
    }

    private static void printArray(Integer[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
}
