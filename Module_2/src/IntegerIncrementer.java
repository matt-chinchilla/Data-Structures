public class IntegerIncrementer {
    public static Integer[] incrementLargeInteger(Integer[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {  // Start from the last digit
            if (digits[i] < 9) { // If digit is less than 9
                digits[i]++; // Increment the digit
                return digits; // return the array if no carry
            } // If digit is 9
            digits[i] = 0; // Set the digit being incremented to 0
        }

        Integer[] newNumber = new Integer[digits.length + 1];   // Increase size by 1 if all 9s
        newNumber[0] = 1; // first digit becomes 1
        // Fill the rest of the array with 0s
        for (int i = 1; i < newNumber.length; i++) {    
            newNumber[i] = 0;
        }
        
        return newNumber; // return new array of size n+1
    }
}
