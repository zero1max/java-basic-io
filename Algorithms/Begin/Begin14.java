package Algorithms.Begin;

import java.util.Scanner;

public class Begin14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("L: ");
        float L = sc.nextFloat();
        double pi = 3.14;

        double R = L/2;
        double S = pi * (R*R);

        System.out.println("Radiusi: "+R);
        System.out.println("Yuzasi: "+S);
    }
}
