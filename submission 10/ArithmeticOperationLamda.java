package submission10;

interface ArithmeticOperation {
    double operate(double x, double y);
}

public class ArithmeticOperationLamda {
    public static void main(String[] args) {
        // Lambda expressions for arithmetic operations
        ArithmeticOperation addition = (x, y) -> x + y;
        ArithmeticOperation subtraction = (x, y) -> x - y;
        ArithmeticOperation multiplication = (x, y) -> x * y;
        ArithmeticOperation division = (x, y) -> {
            if (y == 0) {
                throw new IllegalArgumentException("Cannot divide by zero");
            }
            return x / y;
        };

        // Numbers to perform operations on
        double num1 = 10;
        double num2 = 5;

        // Perform arithmetic operations using lambda expressions
        System.out.println("Addition: " + addition.operate(num1, num2));
        System.out.println("Subtraction: " + subtraction.operate(num1, num2));
        System.out.println("Multiplication: " + multiplication.operate(num1, num2));
        try {
            System.out.println("Division: " + division.operate(num1, num2));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

