import java.util.Scanner;

public class if_operators {
    public static void main(String[] args) {

        // Scanner obyektini yaratish
        Scanner scanner = new Scanner(System.in);

        // Birinchi sonni kiritish
        System.out.println("Yoshingizni kiriting: ");
        int age = scanner.nextInt();

        // Yoshinizni tekshirish
        if (age >= 18) {
            System.out.println("Balog‘atga yetgan");
        } else {
            System.out.println("Balog‘atga yetmagan");
        }
    }
}
