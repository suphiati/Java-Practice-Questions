package Questions;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {

        // Kullanicidan ismini, soyismini ve yasini alip asagidaki formatta yazdirin.
        //girilen bilgiler : J Doe, 44

        Scanner scanner=new Scanner(System.in);

        System.out.println("Isminizi giriniz:");
        String isim= scanner.next();

        System.out.println("Soyisminizi giriniz:");
        String soyisim=scanner.next();

        System.out.println("Yasinizi giriniz:");
        String yas= scanner.next();

        System.out.println("girilen bilgiler: "+isim.charAt(0)+" "+soyisim+", "+yas);



    }
}
