package Questions;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {

        // Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen ilk sayiyi giriniz");
        double sayi1= scanner.nextDouble();
        System.out.println("Lütfen ikinci sayiyi giriniz");
        double sayi2 = scanner.nextDouble();
        System.out.println("Sayilarin ilk degerleri: "+sayi1+", "+sayi2);

        double swap=sayi1;
        sayi1=sayi2;
        sayi2=swap;

        System.out.println("Sayilarin swap yeni degerleri: "+sayi1+", "+sayi2);
    }
}
