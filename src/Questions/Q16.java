package Questions;

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {

        //Kullanicidan bir sayi isteyin, sayiyi kontrol edip 5 ile bolunebiliyorsa
        //“Sayi 5’in tam kati” yazdirin.

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        int sayi= scanner.nextInt();
        if (sayi%5==0){
            System.out.println("Sayi 5'in tam kati");
        }
    }
}
