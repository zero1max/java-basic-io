package Algorithms.Begin;

import java.util.Scanner;

public class Begin6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("a qirrasi: ");
        float a = sc.nextFloat();
        System.out.print("b qirrasi: ");
        float b = sc.nextFloat();
        System.out.print("c qirrasi: ");
        float c = sc.nextFloat();

        double V = a*b*c;
        double S = 2*(a*b+b*c+a*c);

        System.out.println("Hajmi: "+V);
        System.out.println("Yuzasi: "+S);

        sc.close();
    }
}
