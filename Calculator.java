package project1;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for two numbers
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        System.out.println("Enter the third number: ");
        double num3 = sc.nextDouble();

        // Ask user for operation
        System.out.print("Choose operation (+, -, *, /): ");
        char op = sc.next().charAt(0);

        double result;

        if (op == '+') {
            result = num1 + num2+num3;
        } else if (op == '-') {
            result = num1 - num2;
        } else if (op == '*') {
            result = num1 * num2;
        } else if (op == '/') {
            if (num2 == 0) {
                System.out.println("Error: Cannot divide by 0!");
                return;
            }
            result = num1 / num2;
        } else {
            System.out.println("Invalid operation!");
            return;
        }

        System.out.println("Result: " + result);
    }
}

