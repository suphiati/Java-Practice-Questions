package Questions;

import java.util.Scanner;

public class Q29 {
    public static void main(String[] args) {
        //Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri , Erkek 65
        //yas ve uzeri emekli olabilir. Cinsiyet ve yasini dikkate alarak “Emekli
        //olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen cinsiyetinizi giriniz: E: Erkek, K: Kadin");
        char cinsiyet = scanner.next().toUpperCase().charAt(0);
        System.out.println("Lütfen yasinizi giriniz");
        int yas = scanner.nextInt();

        if (yas < 20 || yas > 75) {
            System.out.println("Gecersiz yas");
        } else if (yas < 60) {
            if (cinsiyet == 'K') {
                System.out.println("Kadin, emekli olabilmek icin " + (60 - yas) + " yil daha calisman gerekir");
            } else if (cinsiyet == 'E') {
                System.out.println("Erkek, emekli olabilmek icin " + (65 - yas) + " yil daha calisman gerekir");

            }else {
            System.out.println("cinsiyet hatali");
        }
        } else if (yas<65) {
            if (cinsiyet=='K'){
                System.out.println("Kadin, emekli olabilir");
            } else if (cinsiyet=='E') {
                System.out.println("Erkek, emekli olabilmek icin " + (65 - yas) + " yil daha calisman gerekir");

            }else {
                System.out.println("cinsiyet hatali");
            }
        }else {
            if (cinsiyet == 'K' || cinsiyet == 'E'){
                System.out.println("Emekli olabilir");
            }else {
                System.out.println("cinsiyet hatali");
            }

        }


    }
}
