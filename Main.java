import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Bu "Hello, World!" xabarini chiqaradi
        System.out.println("Hello, World!");
        
        // Scanner obyektini yaratish
        Scanner scanner = new Scanner(System.in);
        
        // Birinchi sonni kiritish
        System.out.println("Birinchi son kiriting: ");
        int a = scanner.nextInt();
        
        // Ikkinchi sonni kiritish
        System.out.println("Ikkinchi son kiriting: ");
        int b = scanner.nextInt();
        
        // Natijani chiqarish
        System.out.println("Yig‘indi: " + (a + b));
    }
}
