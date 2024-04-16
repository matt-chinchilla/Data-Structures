import java.util.Random;
import java.util.Scanner;

public class ArrayGenerator {
    public static Integer[] generateRandomArray() {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the input length of your array?:");
        int n = scanner.nextInt();

        Random random = new Random();
        Integer[] A = new Integer[n];
        for (int i = 0; i < n; i++) {
            // Generate digits between 0 and 9
            A[i] = random.nextInt(10);
        }
        scanner.close(); // Close the scanner object
        return A;
    }

     // New method to generate an array of a specific size with random digits
     public static Integer[] generateRandomArrayOfSize(int size) {
        Random random = new Random();
        Integer[] A = new Integer[size];
        for (int i = 0; i < size; i++) {
            // Generate digits between 0 and 9
            A[i] = random.nextInt(10);
        }
        return A;
    }
    
}
