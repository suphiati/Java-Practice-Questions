package Questions;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {

        // Int olarak verilen 3 degerin ortalamasini double olarak yazdiran bir kod yazin

        Scanner scanner= new Scanner(System.in);

        System.out.println("Lütfen 3 tane int değer giriniz");
        int sayi1= scanner.nextInt();
        int sayi2= scanner.nextInt();
        int sayi3= scanner.nextInt();

        double sayilar=sayi1+sayi2+sayi3;
        double sayilarOrt=sayilar/3;

        System.out.println("Değerlerin ortalaması: "+sayilarOrt +" dur");

    }
}
