package Algorithms.Begin;

import java.util.Scanner;

public class Begin5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Kubni qirrasini kiriting: ");
        float a = sc.nextFloat();

        double V = (float)Math.pow(a, 3);
        double S = 6 * (float)Math.pow(a, 2);

        System.out.println("Hajmi: "+V);
        System.out.println("Yuzasi: "+S);
    }
}
