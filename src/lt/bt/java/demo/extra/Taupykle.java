package lt.bt.java.demo.extra;

import java.util.Scanner;

public class Taupykle {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Kiek yra monetu po 5ct? ");
        int a = keyboard.nextInt();

        System.out.print("Kiek yra monetu po 20ct? ");
        int b = keyboard.nextInt();

        System.out.print("Kiek yra monetu po 2Lt? ");
        int c = keyboard.nextInt();

        double ats;
        ats = (a * 0.05) + (b * 0.2) + (c * 2);

        System.out.print("Taupykleje yra " + ats + " Lt");
    }
}
