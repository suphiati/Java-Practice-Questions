package Questions;

import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {

        // Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut kitle endeksini
        //hesaplayin (kilo*10000 / (boy *boy)) vucut kitle endeksi 30’dan buyukse
        //obez, 25-30 arasi ise kilolu, 20-25 arasi ise normal, 20’den kucukse
        //zayif yazdirin.

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen kilonuzu giriniz:");
        double kilo= scanner.nextDouble();
        System.out.println("Lütfen boyunuzu cm olarak giriniz:");
        double boy= scanner.nextDouble();
        double kitleEndeksi= (kilo*10000/ (boy*boy));

        if (kitleEndeksi>30){
            System.out.println("Kitle Endeksine göre durumunuz: Obez");
        } else if (kitleEndeksi>25 && kitleEndeksi<=30) {
            System.out.println("Kitle Endeksine göre durumunuz: Kilolu");

        } else if (kitleEndeksi>=20 && kitleEndeksi<=25) {
            System.out.println("Kitle Endeksine göre durumunuz: Normal");

        } else if (kitleEndeksi<20) {
            System.out.println("Kitle Endeksine göre durumunuz: Zayif");

        }else {
            System.out.println("Geçersiz giriş yaptınız");
        }
    }



    }

