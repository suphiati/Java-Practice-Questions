package Questions;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {

        // Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
        //Isminiz : John
        //Soyisminiz : Doe
        //Yasiniz : 44
        //Kaydiniz basariyla tamamlanmistir.

        Scanner scanner=new Scanner(System.in);

        System.out.println("Lütfen isminizi giriniz");
        String Isminiz= scanner.next();
        System.out.println("Lütfen soyisminizi giriniz");
        String Soyisminiz=scanner.next();
        System.out.println("Lütfen yasinizi giriniz");
        String Yasiniz=scanner.next();

        System.out.println("Isminiz: "+Isminiz+"\n"+"Soyisminiz: "+Soyisminiz+"\n"+"Yasiniz: "+Yasiniz);

        System.out.println("Kaydiniz basariyla tamamlanmistir.");

    }
}
