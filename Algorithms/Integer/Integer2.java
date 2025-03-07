package Algorithms.Integer;

import java.util.Scanner;

public class Integer2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("M: ");
        float m = sc.nextInt();

        double t = m/1000;
        System.out.println("T: "+t);

        sc.close();
    }
}
