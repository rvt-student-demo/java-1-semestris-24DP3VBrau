package rvt;

import java.util.Scanner;

public class RepeatingBreakingAndRemembering {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Write numbers: ");

        while (true) {
            
            if (!reader.hasNextInt()) {
                reader.next();
                continue;
            }

            int input = reader.nextInt();

            if (input == -1) {
                System.out.println("Thx! Bye!");
                break;
            }
        }

        reader.close();
    }
}