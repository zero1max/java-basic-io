package Algorithms.Begin;

import java.util.Scanner;

public class Begin19 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("x1: ");
        int x1 = scanner.nextInt();
        System.out.print("y1: ");
        int y1 = scanner.nextInt();
        System.out.print("x2: ");
        int x2 = scanner.nextInt();
        System.out.print("y2: ");
        int y2 = scanner.nextInt();

        int L = Math.abs(x2 - x1);
        int H = Math.abs(y2 - y1);

        int P = 2 * (L + H);
        int S = L * H;

        System.out.println("Perimetri: " + P);
        System.out.println("Yuzasi: " + S);
    }
}
