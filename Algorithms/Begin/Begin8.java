package Algorithms.Begin;

import java.util.Scanner;

public class Begin8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("a: ");
        float a = sc.nextFloat();
        System.out.print("b: ");
        float b = sc.nextFloat();

        double orta = (a+b)/2;

        System.out.println("Arifmetik o'rtachasi: "+orta);
    }
}
