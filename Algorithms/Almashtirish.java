package Algorithms;

import java.util.Scanner;

public class Almashtirish {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("a: ");
        int a = sc.nextInt();

        System.out.print("b: ");
        int b = sc.nextInt();

        System.out.print("c: ");
        int c = sc.nextInt();

        System.out.print("d: ");
        int d = sc.nextInt();

        System.out.print("e: ");
        int e = sc.nextInt();

        int f = b;
        b = a;
        a = c;
        c = d;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
