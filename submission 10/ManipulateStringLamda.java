package submission10;

interface StringOperation {
    String operate(String str);
}

public class ManipulateStringLamda {
    public static void main(String[] args) {
        // Lambda expressions for string operations
        StringOperation toUpperCase = str -> str.toUpperCase();
        StringOperation toLowerCase = str -> str.toLowerCase();
        StringOperation reverseString = str -> {
            StringBuilder sb = new StringBuilder(str);
            return sb.reverse().toString();
        };

        // Example string to manipulate
        String inputString = "Indranil Dutta";

        // Perform string operations using lambda expressions
        System.out.println("Original String: " + inputString);
        System.out.println("Uppercase: " + toUpperCase.operate(inputString));
        System.out.println("Lowercase: " + toLowerCase.operate(inputString));
        System.out.println("Reversed: " + reverseString.operate(inputString));
    }
}

