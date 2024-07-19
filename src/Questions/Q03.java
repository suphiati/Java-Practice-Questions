package Questions;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {

        // Kullanicidan bir double, bir de int sayi alip bunlarin toplamini ve carpimini yazdirin.

        Scanner scanner= new Scanner(System.in);

        System.out.println("Lütfen double bir değer girin");
        double sayi1= scanner.nextDouble();

        System.out.println("Lütfen int bir değer girin");
        int sayi2= scanner.nextInt();


        double sayilarToplami=sayi1+sayi2;
        System.out.println("İki sayinin toplami: "+sayilarToplami);

        double sayilarCArpimi=sayi1*sayi2;
        System.out.println("İki sayinin carpimi: "+ sayilarCArpimi);

    }
}
