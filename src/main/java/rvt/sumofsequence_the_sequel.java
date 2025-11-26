package rvt;

import java.util.Scanner;

public class sumofsequence_the_sequel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("First number? ");
        int start = scanner.nextInt();

        System.out.print("Last number? ");
        int end = scanner.nextInt();

        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        System.out.println("The sum is " + sum);
    }
}