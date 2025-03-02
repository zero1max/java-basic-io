package Algorithms.Begin;

import java.util.Scanner;

public class Begin4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("d kiriting: ");
        float d = scanner.nextFloat();
        double pi = 3.14;
        double L = pi * d;

        System.out.println("Uzunligi: "+L);

        scanner.close();
    }
}
