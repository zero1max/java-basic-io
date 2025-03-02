package Algorithms.Begin;

import java.util.Scanner;

public class Begin7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("R: ");
        float R = sc.nextFloat();
        double pi = 3.14;

        double L =  2*pi*R;
        double S =  pi * (float)Math.pow(R, 2);

        System.out.println("Uzunligi: "+L);
        System.out.println("Yuzasi: "+S);

        sc.close();
    }
}
