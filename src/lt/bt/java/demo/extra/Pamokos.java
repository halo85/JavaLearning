package lt.bt.java.demo.extra;

import java.util.Scanner;

public class Pamokos {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int pirSkaicius, aSkaicius, tSkaicius, kSkaicius, penSkaicius;
        int pamSkaicius;
        int minutes;

        System.out.print("Iveskite pirmadienio pamoku skaiciu: ");
        pirSkaicius = keyboard.nextInt();
        System.out.print("Iveskite antradienio pamoku skaiciu: ");
        aSkaicius = keyboard.nextInt();
        System.out.print("Iveskite treciadienio pamoku skaiciu: ");
        tSkaicius = keyboard.nextInt();
        System.out.print("Iveskite ketvirtadienio pamoku skaiciu: ");
        kSkaicius = keyboard.nextInt();
        System.out.print("Iveskite penktadienio pamoku skaiciu: ");
        penSkaicius = keyboard.nextInt();

        pamSkaicius = (pirSkaicius + aSkaicius + tSkaicius + kSkaicius + penSkaicius);

        minutes = (pamSkaicius * 45);

        System.out.println("Turi pamoku per savaite: " + pamSkaicius);
        System.out.println("Pamokos sudaro minuciu: " + minutes);
    }
}
