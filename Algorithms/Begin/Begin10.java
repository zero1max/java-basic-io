package Algorithms.Begin;

import java.util.Scanner;

public class Begin10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("a: ");
        float a = sc.nextFloat();
        System.out.print("b: ");
        float b = sc.nextFloat();

        if ( a!=0 && b!=0){
            double yigindi = a+b;
            double ayirma = a-b;
            double kopaytma = a*b;
            double kvadrats = (a*a) / (b*b);

            System.out.println("Yig'indi: "+yigindi);
            System.out.println("Ayirma: "+ayirma);
            System.out.println("Ko'paytma: "+kopaytma);
            System.out.println("Kvadratlar: "+kvadrats);
        } else {
            System.out.print("Error!");
        }

        sc.close();
    }
}
