package Algorithms;

import java.util.Scanner;

public class MusbatManfiy {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Son kiriting: ");
        int a = scanner.nextInt();

        if (a>0){
            System.out.println("Musbat son");
        } else if (a==0){
            System.out.println("Kiritgan son 0");
        } else{
            System.out.println("Manfiy son");
        }
    }
}
