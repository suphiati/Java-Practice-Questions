package Questions;

import java.util.Scanner;

public class Q26 {
    public static void main(String[] args) {
        //Kullanicidan aldigi urun adedi ve liste fiyatini alin, kullaniciya musteri
        //karti olup olmadigini sorun. Musteri karti varsa 10 urunden fazla alirsa
        //%20, yoksa %15 indirim yapin, Musteri karti yoksa 10 urunden fazla
        //alirsa %15, yoksa %10 indirim yapin

        Scanner scanner= new Scanner(System.in);
        System.out.println("Müşteri kartiniz var mi?");
        String musteriKarti=scanner.nextLine().toLowerCase();
        System.out.println("Lütfen ürün adedini giriniz:");
        int urunAdedi= scanner.nextInt();
        System.out.println("Lütfen ürün liste fiyatini giriniz:");
        double urunFiyati= scanner.nextDouble();
        double indirimOrani=0.0;



        if (musteriKarti.equals("evet") && urunAdedi>=10){
            indirimOrani=urunFiyati * (20.0 / 100);
        } else if (musteriKarti.equals("evet") && urunAdedi<10) {
            indirimOrani=urunFiyati*(15.0/100);

        } else if (musteriKarti.equals("hayir") && urunAdedi>=10) {
            indirimOrani=urunFiyati*(15.0/100);

        } else if (musteriKarti.equals("hayir") && urunAdedi<10) {
            indirimOrani=urunFiyati*(10.0/100);
        }else {
            System.out.println("Girdiğiniz bilgiler hatali");
        }

        System.out.println("İndirimli ürün fiyati: "+(urunFiyati-indirimOrani));
    }
}
