package Questions;

import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {

        //Kullanicidan bir harf alin, harf ile baslayan bir ay varsa yazdirin.
        //NOT: Buyuk harf, kucuk harf hassasiyeti olmasin.
        //Kullanici o veya O yazdiginda output Ocak olsun.

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz:");

        char harf= scanner.next().toLowerCase().charAt(0);

        if (harf=='O'){
            System.out.println("Ocak");
        }
        if (harf=='ş'){
            System.out.println("Şubat");
        }
        if (harf=='m'){
            System.out.println("Mart");
        }
        if (harf=='n'){
            System.out.println("Nisan");
        }
        if (harf=='m'){
            System.out.println("Mayıs");
        }
        if (harf=='h'){
            System.out.println("Haziran");
        }
        if (harf=='t'){
            System.out.println("Temmuz");
        }
        if (harf=='a'){
            System.out.println("Ağustos");
        }
        if (harf=='e'){
            System.out.println("Eylül");
        }
        if (harf=='e'){
            System.out.println("Eylül");
        }
        if (harf=='e'){
            System.out.println("Ekim");
        }
        if (harf=='a'){
            System.out.println("Aralık");
        }


    }
}
