package Algorithms.Begin;

import java.util.Scanner;

public class Begin15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("S: ");
        float S = sc.nextFloat();
        double pi = 3.14;

        double R = Math.sqrt(S);
        double D = R * 2;
        double L =  2 * pi * R;
        System.out.println("R: "+R);
        System.out.println("D: "+D);
        System.out.println("L: "+L);
    }
}
