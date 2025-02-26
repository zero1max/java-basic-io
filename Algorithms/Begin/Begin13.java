package Algorithms.Begin;

import java.util.Scanner;

public class Begin13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("r1: ");
        float r1 = sc.nextFloat();
        System.out.print("r2: ");
        float r2 = sc.nextFloat();
        double pi = 3.14;

        if (r1>r2){
            double S1 = pi * (r1*r1);
            double S2 = pi * (r2*r2);
            double S3 = S1 - S2;

            System.out.println("S1: "+S1);
            System.out.println("S2: "+S2);
            System.out.println("S3: "+S3);
        } else {
            System.out.print("Error!");
        }
    }
}
