import java.util.Scanner;

public class AdditionProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user to enter two numbers
        System.out.print("Enter first number: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double secondNumber = scanner.nextDouble();

        // Calculate the sum
        double sum = firstNumber + secondNumber;

        // Display the result
        System.out.println("The sum of " + firstNumber + " and " + secondNumber + " is: " + sum);

        scanner.close(); // Close the scanner
    }
}
