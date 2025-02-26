package Algorithms.Begin;

import java.util.Scanner;

public class Begin20 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("x1 nuqta: ");
        float x1 = sc.nextFloat();
        System.out.print("y1 nuqta: ");
        float y1 = sc.nextFloat();
        System.out.print("x2 nuqta: ");
        float x2 = sc.nextFloat();
        System.out.print("y2 nuqta: ");
        float y2 = sc.nextFloat();

        double Distance = Math.sqrt( Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2) );
        System.out.println("Distance: "+Distance);
    }
}
