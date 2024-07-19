package Questions;

import java.util.Scanner;

public class Q02 {

    public static void main(String[] args) {


        //Kullanicidan uc farkli data turunde deger alip, girilen degerleri aciklamalariyla yazdirin.


        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen bir tam değer girin");
        int girilenSayi= scanner.nextInt();

        System.out.println("Lütfen bir double değer girin");
        double girilenDouble= scanner.nextDouble();

        System.out.println("Lütfen bir harf girin");
        char girilenHarf=scanner.next().charAt(0);

        System.out.println("Girilen "+girilenSayi+"  değeri bir int değerdir");
        System.out.println("Girilen "+girilenDouble+"  değeri bir double değerdir");
        System.out.println("Girilen "+girilenHarf+"  değeri bir char değerdir");



    }
}
