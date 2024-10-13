package Questions;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {

        //Kullanicidan bir double, bir tamsayi alin, double sayiyi ikinci sayiya bolun
        //ve bolum isleminin sonucununun tamsayi kismini yazdirin.

        Scanner scanner= new Scanner(System.in);
        System.out.println("İlk sayiyi girin: ");
        double sayi1= scanner.nextDouble();
        System.out.println("İkinci sayiyi girin");
        int sayi2=scanner.nextInt();

        int sonuc= (int) (sayi1/sayi2);

        System.out.println("Bölme sonucu: "+sonuc);
    }
}
