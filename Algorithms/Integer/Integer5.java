package Algorithms.Integer;

import java.util.Scanner;

public class Integer5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("A: ");
        int a = sc.nextInt();
        System.out.print("B: ");
        int b = sc.nextInt();

        int N = a%b;
        System.out.println("N: "+N);

        sc.close();
    }
}
