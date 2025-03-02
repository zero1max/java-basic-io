package Algorithms.Begin;

import java.util.Scanner;

public class Begin16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("x1: ");
        float x1 = sc.nextFloat();
        System.out.print("x2: ");
        float x2 = sc.nextFloat();

        double Distance = Math.abs(x2-x1);
        System.out.println("Distance: "+Distance);

        sc.close();
    }
}
