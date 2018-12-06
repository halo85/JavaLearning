/*
 * Programa, apskaičiuoja trapecijos:
 * Plotą: ((a + b) * h) / 2
 * Perimetrą: (a + b + c + d)
 * Pvz:  a = 6, b = 7, c = 5, d = 4, h = 9
 * Rezultatas:
 * Plotas:     58.5
 * Perimetras: 22
 */
package lt.bt.java.demo.extra;

import java.util.Scanner;

public class Trapecija {

    private static float areaTrapezium(float a, float b, float h) {
        return ((a + b) * h) / 2;
    }

    private static float perimeterTrapezium(float a, float b, float c, float d) {
        return (a + b + c + d);
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Trapecijos trumpesniojo pagrindo ilgis a: ");
        float a = in.nextFloat();

        System.out.print("Trapecijos ilgesniojo pagrindo ilgis b: ");
        float b = in.nextFloat();

        System.out.print("Trapecijos sonines krastines ilgis c: ");
        float c = in.nextFloat();

        System.out.print("Trapecijos sonines krastines ilgis d: ");
        float d = in.nextFloat();

        System.out.print("Trapecijos aukštinės ilgis h: ");
        float h = in.nextFloat();

        // Ploto reiksme.
        System.out.println("Trapecijos plotas: ");
        System.out.println(areaTrapezium(a, b, h));

        // Perimetro reiksme.
        System.out.print("Trapecijos perimetras: ");
        System.out.println(perimeterTrapezium(a, b, c, d));
    }
}
