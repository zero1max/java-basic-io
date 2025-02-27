package Algorithms.Begin;

import java.util.Scanner;

public class Begin18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("A nuqta: ");
        int A = scanner.nextInt();

        System.out.print("B nuqta: ");
        int B = scanner.nextInt();

        System.out.print("C nuqta: ");
        int C = scanner.nextInt();

        int AC = Math.abs(C - A);
        int BC = Math.abs(B - C);

        int result = AC * BC;

        System.out.println("AC * BC = " + result);
    }
}
