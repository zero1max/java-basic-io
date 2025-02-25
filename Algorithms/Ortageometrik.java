package Algorithms;

import java.util.Scanner;

public class Ortageometrik {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("a: ");
        float a = scanner.nextFloat();

        System.out.print("b: ");
        float b = scanner.nextFloat();

        System.out.print("c: ");
        float c = scanner.nextFloat();

        System.out.print("d: ");
        float d = scanner.nextFloat();

        System.out.print("e: ");
        float e = scanner.nextFloat();

        double yarim_orta = a+b+c+d+e;
        double orta_arifmetik = yarim_orta/5;
        System.out.print("Natija: "+orta_arifmetik);

        double yarim_geo = a*b*c*d*e;
        double orta_geometrik = (float)Math.pow(yarim_geo, 1/5);
        System.out.print("Natija: "+orta_geometrik);
    }
}
