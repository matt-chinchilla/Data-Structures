package Recursion_Fibonacci;

//package Recursion_Fibonacci;
import java.util.Scanner;

public class Fibonacci {
    // Recursive method to find nth Fibonacci number
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the term you want to find:");
        int n = scanner.nextInt();
        System.out.println("The " + n + "th term in the Fibonacci sequence is " + fibonacci(n));
        scanner.close();
    }
}