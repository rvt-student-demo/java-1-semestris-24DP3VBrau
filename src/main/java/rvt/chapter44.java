package rvt;
import java.util.Scanner;

public class chapter44 {

    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
        ex5();
        ex6();
        ex7();
    }

    


    public static void ex1() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = in.nextLine().trim();

        int spaceIndex = name.indexOf(" ");

        if (spaceIndex <= 0) {
            System.out.println(name);
        } else {
            String first = name.substring(0, spaceIndex);
            String last = name.substring(spaceIndex + 1).toUpperCase();
            System.out.println(first + " " + last);
        }
    }


    public static void ex2() {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a string:");
        String s = in.nextLine();

        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
    }


    public static void ex3() {
    Scanner in = new Scanner(System.in);

    while (true) {
        System.out.println("Enter a name:");
        String line = in.nextLine().trim();

        if (line.length() == 0) {
            break; 
        }

        
        int spaceIndex = line.indexOf(" ");
        String firstName;

        if (spaceIndex == -1) {
            firstName = line;              
        } else {
            firstName = line.substring(0, spaceIndex);
        }

        
        String lower = firstName.toLowerCase();

        String title = "";

        
        if (lower.equals("amy") || lower.equals("buffy") || lower.equals("cathy")) {
            title = "Ms. ";
        } 
        else if (lower.equals("elroy") || lower.equals("fred") || lower.equals("graham")) {
            title = "Mr. ";
        }

        System.out.println(title + line + "\n");
    
    }
}

    public static void ex4() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter cook time-> ");
        String digits = in.nextLine();

        int len = digits.length();
        String minutes;
        String seconds;

        if (len <= 2) {
            minutes = "0";
            seconds = digits;
        } else {
            minutes = digits.substring(0, len - 2);
            seconds = digits.substring(len - 2);
        }

        System.out.println("Your time->  " + minutes + ":" + seconds);
    }

    public static void ex5() {
        Scanner in = new Scanner(System.in);

        while (in.hasNextLine()) {
            String line = in.nextLine();
            if (line.startsWith("//")) {
                System.out.println(line);
            }
        }
    }



    public static void ex6() {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your password:");
            String pass = in.nextLine();

            boolean longEnough = pass.length() >= 7;
            boolean hasUpper = !pass.equals(pass.toLowerCase());
            boolean hasLower = !pass.equals(pass.toUpperCase());

            boolean hasDigit = false;
            for (int i = 0; i < pass.length(); i++) {
                if (Character.isDigit(pass.charAt(i))) {
                    hasDigit = true;
                }
            }

            if (longEnough && hasUpper && hasLower && hasDigit) {
                System.out.println("Acceptable password.");
                return;
            } else {
                System.out.println("That password is not acceptable.\n");
            }
        }
    }

    public static void ex7() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a word -->");
        String word = in.nextLine();

        int spaces = 0;

        while (word.length() > 0) {

            
            for (int i = 0; i < spaces; i++) {
                System.out.print(" ");
            }

            System.out.println(word);

            spaces++;

            if (word.length() <= 2)
                break;

            word = word.substring(1, word.length() - 1);
        }
    }
}