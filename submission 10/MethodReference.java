package submission10;

@FunctionalInterface
interface SquareCalculator {
    double calculateSquare(double num);
}

public class MethodReference {
    // Static method to calculate the square of a number
    public static double square(double num) {
        return num * num;
    }

    public static void main(String[] args) {
        // Using method reference to call the static method
        SquareCalculator calculator = MethodReference::square;

        // Number for which square needs to be calculated
        double number = 10;

        // Calculating square using method reference
        double square = calculator.calculateSquare(number);

        System.out.println("Square of " + number + " is: " + square);
    }
}
