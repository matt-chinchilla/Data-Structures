import java.util.Scanner;

public class UserInputHandler {
    
    public static Integer[] getUserInputDigits() {
        Scanner scanner = new Scanner(System.in);   // Make a scanner
        System.out.println("Enter the number of digits: ");  // Prompt for input of number of digits
            int size = scanner.nextInt();   // Take in size of the number of digits as an integer object
            scanner.nextLine();  // Go to the next line

        Integer[] digits = new Integer[size]; // Create an array of integers of size *size* to be fill array with each (n * 10^x-1)
        System.out.println("Enter each digit followed by enter: ");

        for (int i = 0; i < size; i++) {
            digits[i] = scanner.nextInt(); 
            scanner.nextLine();  // Consume newline left-over
        }
        scanner.close();    // Close the scanner object
        return digits;
    }
}
