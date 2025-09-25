package rvt;

import java.util.Scanner;

public class Delikatse {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadiet preci: ");
        String ads = scanner.nextLine();
        System.out.print("Ievadi cenu: ");
        double price = scanner.nextInt();
        System.out.println("Ekspress piegade");
        double skaitlis = scanner.nextInt();
        double piegāde = 2.00;
        double ekpress = 3.00;
        double k = 2.00;
        if (skaitlis == 1) {
            System.out.println(k = piegāde + ekpress);
        } else {
            System.out.println(k);
        }

        double summa = k + price;

        System.out.println(ads + price);
        System.out.println("piegade   " + k);
        System.out.println("Kopa   " + summa);

    }
}
