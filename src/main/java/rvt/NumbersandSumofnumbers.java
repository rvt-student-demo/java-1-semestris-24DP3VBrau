package rvt;

import java.util.Scanner;

public class NumbersandSumofnumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;

        while (true) {
            System.out.print("Enter a number (0 to stop): ");
            if (!scanner.hasNextInt()) {
                scanner.next(); // discard invalid token
                System.out.println("Please enter an integer.");
                continue;
            }
            int n = scanner.nextInt();
            if (n == 0) break;
            count++;
            sum += n;
        }

        System.out.println("Amount of numbers: " + count);
        System.out.println("Sum of numbers: " + sum);

        scanner.close();
    }
}