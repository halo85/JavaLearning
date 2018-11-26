package lt.bt.java.demo.extra;

import java.util.Scanner;

public class Pamokos2 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Iveskite pirmadienio pamoku skaiciu: ");
        int pir = keyboard.nextInt();

        System.out.print("Iveskite antradienio pamoku skaiciu: ");
        int ant = keyboard.nextInt();

        System.out.print("Iveskite treciadienio pamoku skaiciu: ");
        int tre = keyboard.nextInt();

        System.out.print("Iveskite ketvirtadienio pamoku skaiciu: ");
        int ket = keyboard.nextInt();

        System.out.print("Iveskite penktadienio pamoku skaiciu: ");
        int pen = keyboard.nextInt();

        int pamsk, minutes;
        pamsk = (pir + ant + tre + ket + pen);
        minutes = (pamsk * 45);

        System.out.println("Pamoku skaicius: " + pamsk);
        System.out.println("Tai sudaro minuciu: " + minutes);
    }
}
