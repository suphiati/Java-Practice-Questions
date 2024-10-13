package Questions;

import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {

        //Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk harf
        //olarak yazdirin, yoksa girilen harfi yazdirin

        Scanner scanner= new Scanner(System.in);

        System.out.println("Lütfen bir karakter giriniz");

        char karakter= scanner.next().charAt(0);
        if (Character.isLowerCase(karakter)){
            System.out.println("Girilen harf: "+Character.toUpperCase(karakter));
        }else {
            System.out.println("Girilen harf: "+karakter);
        }
    }
}
