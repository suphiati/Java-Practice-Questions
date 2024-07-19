package Questions;

import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {

        //Kullanicidan iki sayi alip, ucuncu bir degisken kullanmadan ikisinin degerlerini degistirin(swap).

        Scanner scanner=new Scanner(System.in);
        System.out.println("İlk sayiyi giriniz");

        int sayi1= scanner.nextInt();

        System.out.println("Ikinci sayiyi giriniz");
        int sayi2= scanner.nextInt();
        System.out.println("Sayilarin ilk degerleri: "+sayi1+", "+sayi2);

        sayi1=sayi1+sayi2;
        sayi2=sayi1-sayi2;
        sayi1=sayi1-sayi2;

        System.out.println("Sayilarin yeni degerleri: "+sayi1+", "+sayi2);


    }
}
