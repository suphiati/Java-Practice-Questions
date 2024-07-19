package Questions;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {

        // Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip, dikdortgenin alanini yazdirin

        Scanner scanner= new Scanner(System.in);

        System.out.println("Dikdörtgen birinci kenar uzunlugu giriniz");
        double sayi1= scanner.nextDouble();
        System.out.println("Dikdörtgen ikinci kenar uzunlugu giriniz");
        double sayi2= scanner.nextDouble();

        System.out.println("Dikdörtgenin alani: "+sayi1*sayi2);



    }
}
