package Algorithms.Begin;

import java.util.Scanner;

public class Begin2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kvadratning tomonini kiriting: ");
        float a = scanner.nextFloat();

        float S = (float)Math.pow(a, 2);
        System.out.print("Yuzasi: "+S);

    }
}
