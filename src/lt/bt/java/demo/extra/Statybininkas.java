package lt.bt.java.demo.extra;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Statybininkas {
    public static void main(String[] args) {

        /*
         * Constants meter in 1 centimeter.
         */
        final double METER = 0.01;

        /*
         * Constants litas in 1 cent.
         */
        final double LITAS = 100;


        Scanner in = new Scanner(System.in);

        DecimalFormat brickF = new DecimalFormat("#");
        DecimalFormat litasF = new DecimalFormat("#.00");

        System.out.print("Sienos ilgis: ");
        int wallL = in.nextInt();

        System.out.print("Sienos aukstis: ");
        int wallH = in.nextInt();
        int wall;
        wall = (wallL * wallH);


        System.out.print("Plytos ilgis cm: ");
        double brickL = in.nextDouble();

        System.out.print("Plytos aukstis cm: ");
        double brickH = in.nextDouble();

        /* Convert cm into m */
        double metL, metH;
        double brick;
        //brick = (brickL / 100f) * (brickH / 100f);

        metL = brickL * METER;
        metH = brickH * METER;

        brick = (metL * metH);

        System.out.print("Plytos kaina ct: ");
        double ct = in.nextDouble();

        //lit = (ct / 100f);

        /* Convert cents into litas */
        double lit;

        lit = (ct / LITAS);

        double brickN, brickP;
        brickN = (wall / brick);
        System.out.println("Plytu kiekis: " /*+ Math.round(brickN)*/ + brickF.format(brickN) + " plytu.");

        brickP = (brickN * lit);
        System.out.println("Plytos kainuos: " /*+ Math.round(brickP)*/ + litasF.format(brickP) + " Lt.");
    }
}
