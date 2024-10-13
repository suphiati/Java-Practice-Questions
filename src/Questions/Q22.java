package Questions;

import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {

        //Kullanicidan bir karakter girmesini isteyin, girilen karakterin buyuk harf
        //olup olmadigini yazdirin.

        Scanner scanner =new Scanner(System.in);

        System.out.println("Lütfen bir karakter giriniz");
        char harf= scanner.next().charAt(0);
        if (harf>='A'&& harf<='Z'){
            System.out.println("Girilen karkater buyuk harf");
        }else {
            System.out.println("Girilen harf buyuk harf degil");
        }

    }
}
