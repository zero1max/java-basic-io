package Algorithms.Integer;

import java.util.Scanner;

public class Integer3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("b: ");
        float b = sc.nextFloat();

        double kb = b/1024;
        System.out.println("KB: "+kb);

        sc.close();
    }
}
