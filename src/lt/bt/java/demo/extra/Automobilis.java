package lt.bt.java.demo.extra;

import java.util.Scanner;

public class Automobilis {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Iveskite tunelio ilgi: ");
        double ilg = keyboard.nextInt();

        System.out.print("Iveskite automobilio greiti: ");
        int grt = keyboard.nextInt();

        double ailg = ilg / 1000;

        double laik = (grt * ailg);

        System.out.println("Automobilis tuneli pravaziuos per " + laik + " s.");
    }
}
