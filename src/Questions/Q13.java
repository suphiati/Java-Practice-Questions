package Questions;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {


        // Kullanicdan iki double sayi alin, ilk sayiyi ikinci sayiya bolun ve
        // bolum isleminin sonucunun tamsayi kismini yazdirin

        Scanner scanner= new Scanner(System.in);

        System.out.println("İlk sayiyi giriniz");
        double sayi1= scanner.nextDouble();
        System.out.println("İkinci sayiyi giriniz");
        double sayi2= scanner.nextDouble();

        int tamSayi = (int) (sayi1 / sayi2);

        System.out.println("Bölme işleminin tamsayi sonucu: " + tamSayi);




    }
}
