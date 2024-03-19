public class Helper {
    public static void processAndPrintIncrementedArray() {
        // Generate a random array
        Integer[] originalDigits = ArrayGenerator.generateRandomArray();
        
        // Clone the original array to keep it unchanged for printing
        Integer[] digitsForIncrement = originalDigits.clone();
        
        // Increment the large integer
        Integer[] incrementedDigits = IntegerIncrementer.incrementLargeInteger(digitsForIncrement);
        
        // Print the original and incremented number using ArrayPrinter class
        ArrayPrinter.printArrays(originalDigits, incrementedDigits);
    }
}
