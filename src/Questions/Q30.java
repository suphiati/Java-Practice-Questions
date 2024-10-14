package Questions;

import java.util.Scanner;

public class Q30 {
    public static void main(String[] args) {

        //Kullanicidan aldigi urun adedi ve ve liste fiyatini alin, kullaniciya musteri
        //karti olup olmadigini sorun. Musteri karti varsa 10 urunden fazla alirsa
        //%20, yoksa %15 indirim yapin, Musteri karti yoksa 10 urunden fazla
        //alirsa %15, yoksa %10 indirim yapin

        Scanner scanner= new Scanner(System.in);
        System.out.println("Müsteri kartiniz var mi? E: Evet, H: Hayir");
        char kart= scanner.next().toUpperCase().charAt(0);
        System.out.println("Lütfen ürün miktarini giriniz");
        int urunMiktari= scanner.nextInt();
        System.out.println("Lütfen ürün fiyatini giriniz");
        double urunFiyati= scanner.nextDouble();


        if (kart=='E'){
            if (urunMiktari>=10){
                System.out.println("%20 indirimli urun fiyati: "+urunFiyati*(80.0/100));

            }else {
                System.out.println("%15 indirimli urun fiyati: "+urunFiyati*(85.0/100));
            }
        } else if (kart=='H') {
            if (urunMiktari>=10){
                System.out.println("%15 indirimli miktari: "+urunFiyati*(85.0/100));
            }else {
                System.out.println("%10 indirimli miktari: "+urunFiyati*(90.0/100));
            }

        }else {
            System.out.println("Yanlis giris yaptiniz");
        }
    }
}
