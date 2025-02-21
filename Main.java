import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        //This is print for Helle, World!
        System.out.println("Hello, World!");
        //This is input for java
        Scanner scanner = new Scanner(System.in);
        //Need First number
        System.out.println("Birinchi son kiriting: ");
        int a = scanner.nextInt();
        //Need Second number
        System.out.println("Ikkinchi son kiriting: ");
        int b = scanner.nextInt();
        //print result
        System.out.println(a+b);
    }
}