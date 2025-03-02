package Algorithms.Begin;

import java.util.Scanner;

public class Begin1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kvadrat tomonini kiriting: ");
        float a = scanner.nextFloat();

        float P = 4*a;
        System.out.print("Uning perimetri: "+P);

        scanner.close();
    }
}
