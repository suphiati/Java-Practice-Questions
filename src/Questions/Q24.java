package Questions;

import java.lang.ref.SoftReference;
import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {

//Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri , Erkek 65
//yas ve uzeri emekli olabilir. Cinsiyet ve yasini dikkate alarak “Emekli
//olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen cinsiyetinizi giriniz: ");
        String cinsiyet = scanner.next().toLowerCase();
        System.out.println("Lütfen yasinizi giriniz");
        int yas = scanner.nextInt();

        if (cinsiyet.equals("kadin") && yas >= 60 || cinsiyet.equals("erkek") && yas >= 65) {
            System.out.println("Emekli olabilirsin");
        }else if (cinsiyet.equals("kadin") && yas < 60){
            System.out.println("Emekli olabilmek için " + (60-yas)+ " yil daha calisman gerekir");
        }else if (cinsiyet.equals("erkek") && yas < 65){
            System.out.println("Emekli olabilmek için " + (60-yas)+ " yil daha calisman gerekir");
        }else {
            System.out.println("Geçersiz bilgi girdiniz");
        }
    }
}