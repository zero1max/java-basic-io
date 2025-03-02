package Algorithms.Begin;

import java.util.Scanner;

public class Begin3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("a tomonni kiriting: ");
        float a = scanner.nextFloat();
        System.out.print("b tomonni kiriting: ");
        float b = scanner.nextFloat();

        float P = 2*(a+b);
        float S = a*b;
        System.out.println("Perimetri: "+P);
        System.out.println("Yuzasi: "+S);

        scanner.close();
    }
}
