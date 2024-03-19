public class Module_2 {
    public static void main(String[] args) {
        // OG method included for Lane
            // // This line replaces the direct input handling in the main method with a call to the UserInputHandler class.
            // // It obtains the array of digits from the user.
            // Integer[] originalDigits = UserInputHandler.getUserInputDigits();
            
            // // Clone the original array so we can modify one and keep the other for comparison
            // Integer[] digitsForIncrement = originalDigits.clone();
            
            // // Increment the large integer using the IntegerIncrementer class
            // Integer[] incrementedDigits = IntegerIncrementer.incrementLargeInteger(digitsForIncrement);
            
            // // Print the original and incremented arrays using the ArrayPrinter class
            // ArrayPrinter.printArrays(originalDigits, incrementedDigits)

            
        // Process the array and print the original and incremented versions
        Helper.processAndPrintIncrementedArray();
    }
}
