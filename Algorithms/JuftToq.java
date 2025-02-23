package Algorithms;

import java.util.Scanner;

public class JuftToq {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Son kiriting: ");
        int a = scanner.nextInt();

        if (a%2==1){
            System.out.println("Toq son");
        } else{
            System.out.println("Juft son");
        }
    }
}
