package Questions;

import java.util.Scanner;
import java.util.SortedMap;

public class Q15 {
    public static void main(String[] args) {

        //Kullanicidan 4 basamakli pozitif bir tamsayi alip rakamlar toplamini bulun


        Scanner scanner= new Scanner(System.in);

        System.out.println("Lütfen 4 basamakli bir sayi giriniz:");

        int sayi= scanner.nextInt();

        int toplam=0;
        toplam += sayi%10;
        sayi /=10;
        toplam+=sayi%10;
        sayi /=10;
        toplam+=sayi%10;
        sayi /=10;
        toplam+=sayi%10;

        System.out.println("Girilen sayinin rakamlari toplami: "+toplam);



    }
}
