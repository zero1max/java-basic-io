# Java Basic Input/Output Program

Bu loyiha Java dasturlash tilida yozilgan oddiy dastur bo‘lib, u "Hello, World!" xabarini chiqaradi va foydalanuvchidan ikkita son kiritishni talab qiladi. Keyin ushbu sonlarni qo‘shib, natijani ekranga chiqaradi.

## Foydalanish

1. Dastur ishga tushirilganda ekranga "Hello, World!" chiqadi.
2. Foydalanuvchi birinchi sonni kiritadi.
3. Foydalanuvchi ikkinchi sonni kiritadi.
4. Dastur ushbu ikki sonni qo‘shib, natijani ekranga chiqaradi.

## Kod

```java
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
```

## Ishga tushirish

1. Java o‘rnatilganligiga ishonch hosil qiling.
2. Kodni `.java` fayl sifatida saqlang (masalan, `Main.java`).
3. Terminal yoki buyruq qatorida quyidagi buyruqlarni ishga tushiring:
   
   ```sh
   javac Main.java
   java Main
   ```

## Talablar

- Java SE Development Kit (JDK) o‘rnatilgan bo‘lishi kerak.

## Muallif

**zero1max**

Bu loyiha Java dasturlash tilining asosiy funksiyalarini o‘rganish uchun yozilgan.

