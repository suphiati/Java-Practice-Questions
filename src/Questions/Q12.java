package Questions;

import java.util.Scanner;

public class Q12 {

    public static void main(String[] args) {

        // Kullanicidan bir sayi alin, kullanici kac degerini girerse girsin,
        // o sayiyi -128 ile 127 arasindaki bir sayiya donusturup yazdirin.

        Scanner scanner= new Scanner(System.in);

        System.out.println("Lütfen bir sayi giriniz:");

        int sayi= scanner.nextInt();

        byte yeniSayi= (byte) sayi;

        System.out.println("Girilen sayi : "+sayi+" fakat donusturulmus hali: "+yeniSayi+": dir");


    }
}
