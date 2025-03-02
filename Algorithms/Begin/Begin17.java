package Algorithms.Begin;

import java.util.Scanner;

public class Begin17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("A nuqta: ");
        float A = sc.nextFloat();
        System.out.print("B nuqta: ");
        float B = sc.nextFloat();
        System.out.print("C nuqta: ");
        float C = sc.nextFloat();

        double AC = Math.abs(C-A);
        double BC = Math.abs(C-B);

        System.out.println("AC: "+AC);
        System.out.println("BC: "+BC);

        sc.close();
    }
}
