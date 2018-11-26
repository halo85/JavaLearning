package lt.bt.java.demo.extra;

import java.util.Scanner;

public class Akvariumas {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Kiek zuvu gyvena akvariume? ");
        int azuv = keyboard.nextInt();

        System.out.print("Kiek zuvu i akvariuma idedama kiekviena diena? ");
        int bzuv = keyboard.nextInt();

        System.out.print("Kiek dienu praejo? ");
        int d = keyboard.nextInt();

        int ats;
        ats = azuv + (bzuv * d);

        System.out.println("Po " + d + " dienu akvariume gyvens" + ats + " zuvu.");
    }
}
