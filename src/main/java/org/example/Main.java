package org.example;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        float a = scanner.nextFloat();
        System.out.println();

        ArrayList<Float> numbers = new ArrayList<>();
        ArrayList<String> operations = new ArrayList<>();
        ArrayList<Float> results = new ArrayList<>();



        while(true) {
            System.out.println("Enter the operator");
            String operator = scanner.next();
            if (operator.equals("E")) {
                System.out.println("Calculator concluded");
                break;
            } else {
                System.out.println("Enter the second number");
                float b = scanner.nextFloat();
                System.out.println();

                float result = 0;
                switch (operator) {
                    case "+":
                        result = a + b;
                        break;
                    case "-":
                        result = a - b;
                        break;
                    case "*":
                        result = a * b;
                        break;
                    case "/":
                        if (b == 0) {
                            System.out.println("Not allowed");
                            return;
                        }
                        result = a / b;
                        break;
                }

                numbers.add(b);
                operations.add(operator);
                results.add(result);

                System.out.println("Result: " + result);

                a = result;

            }
        }

        System.out.print("Entered numbers: ");
        for (Float number : numbers) {
            System.out.print(number + " ");
        }

        System.out.print("\nEntered operations : ");
        for (String operation : operations) {
            System.out.print(operation + " ");
        }

        System.out.print("\nAll Results: ");
        for (Float result : results) {
            System.out.print(result + " ");
        }


    }
}