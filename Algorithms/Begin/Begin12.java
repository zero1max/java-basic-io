package Algorithms.Begin;

import java.util.Scanner;

public class Begin12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("a: ");
        float a = sc.nextFloat();
        System.out.print("b: ");
        float b = sc.nextFloat();

        double c = Math.sqrt(((a*a) + (b*b)));
        double P = a+b+c;

        System.out.println("Gipotenuzasi: "+c);
        System.out.println("Perimetri: "+P);
    }
}
