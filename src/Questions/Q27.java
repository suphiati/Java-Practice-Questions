package Questions;

import java.util.Scanner;

public class Q27 {
    public static void main(String[] args) {
        //Kullanicidan mesafeyi kilometre olarak alin ve cevirmek istedigi birimi
        //sorun, istedigi birim metre veya santimetre ise cevirip yazdirin, yoksa
        //“istediginiz birim sisteme kayitli degil” yazdirin.

        Scanner scanner= new Scanner(System.in);
        System.out.println("Kilometre cinsinden mesafeyi giriniz:");
        double kilometre= scanner.nextDouble();
        System.out.println("Çevirilecek birimi giriniz:");
        String mesafe=scanner.next().toLowerCase();

        if (mesafe.equals("metre")){
            double metre= kilometre*1000;
            System.out.println("Çevirilen birim: "+metre+" metre");
        } else if (mesafe.equals("santimetre")) {
            double santimetre= kilometre*10000;
            System.out.println("Çevirilen birim :"+santimetre+" santimetre");

        }else {
            System.out.println("istediginiz birim sisteme kayitli degil");
        }

    }
}
