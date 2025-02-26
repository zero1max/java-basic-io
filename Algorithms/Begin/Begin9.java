package Algorithms.Begin;

import java.util.Scanner;

public class Begin9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("a: ");
        float a = sc.nextFloat();
        System.out.print("b: ");
        float b = sc.nextFloat();

        if ( a>=0 && b>=0){
            double geo_orta = Math.sqrt(a*b);
            System.out.println("Geometrik o'rtachasi: "+geo_orta);
        } else{
            System.out.println("Error!");
        }

        sc.close();
    }
}
